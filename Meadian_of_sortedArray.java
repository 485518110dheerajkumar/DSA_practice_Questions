import java.util.Scanner;
import java.util.*;
public class Meadian_of_sortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int nums = scn.nextInt();
        int nums1[] = new int[num];
        int nums2[] = new int[nums];
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = scn.nextInt();
        }
        for(int i = 0; i < nums2.length; i++){
            nums2[i] = scn.nextInt();
        }
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
    public static double findMedianSortedArrays(int[] nums11, int[] nums22) {
        double res = 0;
        int len = nums11.length + nums22.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums11.length; i++) {
            list.add(nums11[i]);
        }
        for(int j = 0; j < nums22.length; j++){
            list.add(nums22[j]);
        }
        int max = list.get(0);
        for(int i = 1; i < list.size(); i ++){
            if(max<list.get(i)){
                max = list.get(i);
            }
        }


        if(len % 2 != 0){
            int idx = len/2;
            res = list.get(idx+1);
        }else{
            int idx = len/2;
            float n1 = list.get(idx-1);
            float n2 = list.get(idx);
            float ans = ( n1+ n2)/2;
            res = ans;
        }
        return res;
    }
}
