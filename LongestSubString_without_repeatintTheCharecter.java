import java.util.Scanner;
import java.util.*;

public class LongestSubString_without_repeatintTheCharecter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        lengthOfLongestSubstring(s);
        List<Integer> list = new ArrayList<>();
        list.toArray();
        



    }
    public static void lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        int start = 0;
        int last = 1;
        int idx = 0;
        String sc = "";
        while(last != s.length()+1){
            char ch = s.charAt(idx);
            String sub = s.substring(start,last);
            System.out.println(ch);
            System.out.println(sub);
            idx++;
            last++;

        }




    }
}
