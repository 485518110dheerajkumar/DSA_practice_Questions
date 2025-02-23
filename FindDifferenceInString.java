import java.util.*;
public class FindDifferenceInString {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char ch = ' ';
        ArrayList<Character> s1 = new ArrayList<>();

        for(int i = 0; i < t.length(); i++){
            s1.add(t.charAt(i));
        }

        for(int j =0; j < s.length(); j++){
            if(s1.contains(s.charAt(j))){
                int idx = s1.indexOf(s.charAt(j));
                s1.remove(idx);
            }

        }
        for(char c:s1){
            ch = c;
        }
        System.out.println(ch);
;
    }
}
