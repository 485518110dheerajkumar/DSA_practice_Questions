import java.util.*;

public class ThreeSumLeetCode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scn.nextInt();
        }
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ls = new ArrayList<>();
            int val = 0;
            Arrays.sort(nums);
            for(int i = 0; i < nums.length; i++){
                for(int j = i+1; j < nums.length; j++){
                    for(int k = j+1; k < nums.length; k++){
                        if(nums[i] + nums[j]+ nums[k] == val){
                            ArrayList<Integer> li = new ArrayList<>();
                            li.add(nums[i]);
                            li.add(nums[j]);
                            li.add(nums[k]);
                            if(ls.contains(li)){
                                continue;
                            }else{
                                ls.add(li);
                            }
                        }
                    }
                }
            }
            return ls;

    }
}
