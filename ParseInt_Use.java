import java.util.*;

import static java.lang.Integer.parseInt;

public class ParseInt_Use {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int ans = stringtointeger(s);
        System.out.println(ans);

    }

    private static int stringtointeger(String s) {
        String temp = s;
        String s1 = s.replaceAll("\\s", "");
        int result = parseInt(s1);
        return result;
    }
}
