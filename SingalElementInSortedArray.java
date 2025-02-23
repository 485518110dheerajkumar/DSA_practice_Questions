import java.util.*;

public class SingalElementInSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);

        Stack<Integer> list = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            if(list.contains(arr[i])){
                list.pop();
            }else{
                list.push(arr[i]);
            }
        }
        int ans = list.get(0);
        System.out.println(ans);
    }
}
