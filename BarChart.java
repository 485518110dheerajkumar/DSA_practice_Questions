import java.util.Scanner;

public class BarChart {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        for(int j = 1; j< arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
            }
        }
        for(int flor = max; flor >= 1; flor--){
            for(int i = 0; i< arr.length; i++){
                if(arr[i] >= flor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }
}
