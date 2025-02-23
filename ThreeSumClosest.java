import java.util.*;
public class ThreeSumClosest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        int num = threeSumClosest(nums, target);
        System.out.println(num);
    }


    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    System.out.println(nums[k]+" "+ nums[j]+ " "+ nums[i]);
//                    if(nums[i] + nums[j]+ nums[k] == target){
//                        count++;
//                    }
                }
            }
        }
        return count;
    }
}
