import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int arr1[] = new int[a1];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        int a2 = scn.nextInt();
        int arr2[] = new int[a2];
        for(int j = 0; j < arr2.length; j++){
            arr2[j] = scn.nextInt();
        }

        int dif[] = new int[arr1.length > arr2.length ? arr1.length:arr2.length];

        int borrow = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = dif.length - 1;

        while(k >= 0){
            int dig = 0;
            int a1v = i >= 0 ? arr1[i]:0;
            if(arr2[j] + borrow >= a1v){
                dig = arr2[j] + borrow - a1v;
                borrow = 0;
            }else{
                dig = arr2[j] + borrow + 10 - a1v;
                borrow = -1;
            }
            dif[k] = dig;
            i--;
            j--;
            k--;
        }
        int ind = 0;
        while(ind < dif.length){
            if(ind == dif[ind]){
                ind++;
            }else{
                break;
            }
        }
        while(ind < dif.length){
            System.out.print(dif[ind]);
            ind++;
        }
    }
}
