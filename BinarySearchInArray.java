import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter your target value");
        int t = scn.nextInt();
        Arrays.sort(arr);

        int l = 0;
        int h = arr.length;
        while(l <= h){
            int m = (l + h) / 2;
            if(t > arr[m]){
                l = m + 1;
            }else if(t < arr[m]){
                h = m - 1;
            }else{
                System.out.println(m);
                return;
            }
        }
        System.out.println(-1);
    }
}
