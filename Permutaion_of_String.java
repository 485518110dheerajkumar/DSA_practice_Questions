import java.util.*;
public class Permutaion_of_String {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        permutation(s,"");
    }
    public static void permutation(String sc, String c){

        if(sc.length() == 0){
            System.out.println(c);
            return;
        }
        for(int i = 0; i < sc.length(); i++){
            char ch = sc.charAt(i);

            String left = sc.substring(0,i);
            String right = sc.substring(i+1);
            String result = left + right;
            permutation(result, c+ch);
        }
    }
}
