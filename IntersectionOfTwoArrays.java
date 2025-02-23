import java.util.*;
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int nums1[] = {4, 9, 5};
        int nums2[] = {9, 4, 9, 8, 4};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        //  on inserting one array elements in Array list
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }

        // on checking the second elements in

        for(int j = 0; j < nums2.length; j++){
            if(set.contains(nums2[j])){
                ans.add(nums2[j]);
            }else{
                continue;
            }
        }



//        array transfer

        int arr[] = new int[ans.size()];
        int current = 0;

        for(int num:ans){
            arr[current] = num;
            current++;
        }


        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] +" ");
        }



    }
}
