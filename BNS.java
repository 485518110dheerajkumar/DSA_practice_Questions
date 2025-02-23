import java.util.*;

public class BNS {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the target value");
        int data = scn.nextInt();

        int l = 0;
        int h = arr.length;
        while(l <= h){
            int m = (l + h) / 2;
            if(data > arr[m]){
                l = m + 1;
            }else if(data < arr[m]){
                h = m - 1;
            }else{
                System.out.println(m);
                return;
            }
        }
        System.out.println(-1);
    }
}
