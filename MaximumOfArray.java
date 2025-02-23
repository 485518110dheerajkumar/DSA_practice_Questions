import java.util.Scanner;

public class MaximumOfArray {
    public static int maxOfAy(int [] arr, int n){
        if(n == arr.length-1){
            return arr[n];
        }
        int ans = 0;
        int nmomax = maxOfAy(arr,n+1);
        if(arr[n] > nmomax){
            ans = arr[n];
        }else{
            ans = nmomax;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int maxans = maxOfAy(arr,n);
        System.out.println(maxans);
    }
}
