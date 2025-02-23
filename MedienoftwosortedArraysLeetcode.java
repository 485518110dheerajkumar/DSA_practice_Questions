import java.util.Scanner;
import java.util.*;
public class MedienoftwosortedArraysLeetcode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int nums = scn.nextInt();
        int nums11[] = new int[num];
        int nums22[] = new int[nums];
        for(int i = 0; i < nums11.length; i++){
            nums11[i] = scn.nextInt();
        }
        for(int i = 0; i < nums22.length; i++){
            nums22[i] = scn.nextInt();
        }
            System.out.println(findMedianSortedArrays(nums11,nums22));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0;
        int len = nums1.length + nums2.length;
        List<Integer> list = new ArrayList<>();
        int arra[] = new int[len];
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for(int j = 0; j < nums2.length; j++){
            list.add(nums2[j]);
        }

        for(int i = 0; i < list.size(); i ++){
            arra[i] = list.get(i);
        }
        Arrays.sort(arra);




        if(len % 2 != 0 && list.size() != 1){
            int idx = len/2;
            res = list.get(idx);
        }else if(list.size() == 1){
            res = list.get(0);
        }else{
            int idx = len/2;
            float n1 = list.get(idx-1);
            float n2 = list.get(idx);
            float ans = ( n1+ n2)/2;
            if(ans < 0){
                res = 0;
            }else{
                res = ans;
            }

        }
        return res;
    }
}
