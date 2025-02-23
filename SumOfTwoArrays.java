import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int arr1[] = new int[a1];
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        int a2 = sc.nextInt();
        int arr2[] = new int[a2];
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[a1>a2 ? a1:a2];
        int carray = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = arr3.length - 1;
        while(k>=0){
            int dig = carray;
            if(i>=0){
                dig += arr1[i];
            }
            if(j>=0){
                dig += arr2[j];
            }
            carray = dig / 10;
            dig = dig%10;

            arr3[k] = dig;
            i--;
            j--;
            k--;
        }
        if(carray != 0){
            System.out.print(carray);
        }
        for(int val : arr3){
            System.out.print(val);
        }


    }
}
