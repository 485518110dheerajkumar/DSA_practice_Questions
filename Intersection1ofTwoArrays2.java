import java.util.*;

public class Intersection1ofTwoArrays2 {
    public static void main(String[] args) {
        int nums1[] = {4, 9, 5};
        int nums2[] = {9, 4, 9, 8, 4};
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        //    inserting array 1 elements in arraylist 1
        for(int val:nums1){
            list1.add(val);
        }
        //     after checking inserting elements in arraylist 2
        for(int num = 0; num < nums2.length; num++){
            if(list1.contains(nums2[num])){
                list2.add(nums2[num]);
                list1.remove(Integer.valueOf(nums2[num]));

            }else{
                continue;
            }
        }
        //  Transfering the elements from arraylist to new Array
        int num[] = new int[list2.size()];
        for(int i = 0; i < list2.size(); i++){
            num[i] = list2.get(i);
        }

        for(int j = 0; j < num.length; j++){
            System.out.print(num[j] +" ");
        }
    }
}
