import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scn.nextInt();
        }
        ArrayList<String> list = new ArrayList<>();
        
        String s = "";
        String s1 = "";
        for(int j = 0; j < nums.length; j++){
            s = s + Integer.toString(nums[j]);
        }
        Arrays.sort(nums);
        System.out.println();
        for(int j = 0; j < nums.length; j++){
            s1 = s1 + Integer.toString(nums[j]);
        }

        perm(s1,"",list);
        String ans = "";
        int idx = 0;
        for(int i = 0; i < list.size(); i++){
            if(parseInt(s) == parseInt(list.get(i))){
                idx = i;
            }
        }
        if(idx == list.size() - 1){
            ans = list.get(0);
        }else{
            ans = list.get(idx + 1);
        }
        for(int j = 0; j < ans.length(); j++){
            nums[j] = parseInt(Character.toString(ans.charAt(j)));
        }
        for(int val : nums){
            System.out.print(val);
        }


    }
    public static void perm(String s,String c,ArrayList<String> ls){

        if(s.length() == 0){
//            System.out.println(c);
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
