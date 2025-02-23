import java.util.*;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();

        int nums1[] = new int[m];

        for(int i = 0; i < m; i++){
            nums1[i] = scn.nextInt();
        }


        merge(nums1,m);
    }
    public static void merge(int[] nums1, int m) {
       Queue<Integer> list = new ArrayDeque<>();
       for(int i:nums1){
           list.add(i);

       }

       for(int i = 0; i < 4; i++){
           list.add(list.peek());
           System.out.println(list);
           list.remove();
       }
        System.out.println(list);
    }
}
