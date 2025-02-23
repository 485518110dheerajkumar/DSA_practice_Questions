import java.util.*;
public class ArraysNextPermutation {
    public static void permute(int[] nums, List<List<Integer>> result, List<Integer> cur, Set<Integer> vis) {
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
        int nums[] = new int[3];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scn.nextInt();
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            arr.add(nums[i]);
        }
        Arrays.sort(nums);
        permute(nums, result, li, set);


        for(int i = 0; i < result.size(); i++){

            if(result.get(i).equals(arr) && i != result.size()-1){
                System.out.println(result.get(i+1));
            }else if(result.get(i).equals(arr) && i == result.size()-1){
                System.out.println(result.get(0));
            }

        }

    }
}
