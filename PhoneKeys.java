import java.util.*;
public class PhoneKeys {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        letterCombinations(s);
    }
    public static List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) return Collections.emptyList();

        String[] phonekey = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> out = new ArrayList<>();
        backtrack("", digits, phonekey, out);
        return out;
    }

    public static void backtrack(String combine, String next, String[] phonekey, List<String> out) {
        if (next.isEmpty()) {
            out.add(combine);
        } else {
            String letters = phonekey[next.charAt(0) - '2'];
            for (char letter : letters.toCharArray()) {
                backtrack(combine + letter, next.substring(1), phonekey, out);
            }
        }
    }
}
