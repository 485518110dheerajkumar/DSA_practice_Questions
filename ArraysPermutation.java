import java.util.*;
public class ArraysPermutation {
    private static void permute(int[] nums, List<List<Integer>> result, List<Integer> cur, Set<Integer> vis) {
        if(nums.length == cur.size()) {
            result.add(new ArrayList(cur));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!vis.contains(i)) {
                vis.add(i);
                cur.add(nums[i]);

                permute(nums, result, cur, vis);

                cur.remove(cur.size() - 1);
                vis.remove(i);
                while(i < nums.length - 1 && nums[i] == nums[i + 1]) i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scn.nextInt();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        permute(nums, result,li, st);

        System.out.println(result);
    }
}
