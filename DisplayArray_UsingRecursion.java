import java.util.Scanner;

public class DisplayArray_UsingRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        displayarray(arr,n);
    }

    private static void displayarray(int[] arr, int n) {
        if(n == 0){
            return;
        }
//        displayarray(arr,n-1);    ------------------------ This line for forward Array element printing .
        System.out.print(arr[n-1]+" ");
        displayarray(arr,n-1);  //   ---------------------This line for backward element printing (reverse array).
    }
}
