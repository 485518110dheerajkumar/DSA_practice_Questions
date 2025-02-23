import java.util.Scanner;
import static java.lang.Integer.parseInt;
import java.util.*;
public class Leetcode_Next_Permutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nums[] = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scn.nextInt();
        }
        nextPermutation(nums);
    }




        public static void nextPermutation(int[] nums) {
            String num = "";
            for(int i = 0; i < nums.length; i++){
                num = Integer.toString(nums[i]) + num;
            }
            String s = num;
            int nk = parseInt(s);
            int np = nextpermutaion(nk);
//        for converting
            String dk = Integer.toString(np);
            ArrayList<Integer> anarr = new ArrayList<>();
            for(int i = 0; i < dk.length(); i++){
                int number = parseInt(Character.toString(dk.charAt(i)));
                anarr.add(number);
            }

            System.out.println(anarr);

        }


        //         conversion
        public static int nextpermutaion(int num){
            String s = Integer.toString(num);
            ArrayList<String> ls = new ArrayList<>();
            perm(s,"",ls);
            int ans = 0;
            for(int k = 0; k < ls.size(); k++){
                if(num == parseInt(ls.get(k))){
                    ans = parseInt(ls.get(k+1));
                }
            }

            return ans;
        }
        // this gives all permutations
        public static void perm(String s,String c,ArrayList<String> ls){

            if(s.length() == 0){
                ls.add(c);
                return;

            }
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                String left = s.substring(0,i);
                String right = s.substring(i+1);
                String result = left + right;
                perm(result,c+ch,ls);
            }

        }

}
