import java.util.*;

public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,4 ,5 ,7 ,8 ,9};
        ArrayList<Integer> ls = new ArrayList<>();

        int start = 0;
        int mid = 1;
        int end = 2;
        int ans = 0;
        while(end != arr.length){
            if(arr[start] < arr[mid] && arr[mid] > arr[end]){
                System.out.println(start+ " "+mid+ " "+ end);
                ans = 1;
            }

            if(end == arr.length - 1){
                Arrays.sort(arr);

            }

            start++;
            mid++;
            end++;
        }
        System.out.println(ans);
    }
}
