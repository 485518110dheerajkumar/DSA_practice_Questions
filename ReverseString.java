import java.util.Scanner;

public class ReverseString {
    public static void revstring(String s){

//       Reverse the String

        String newstring = "";
        for(int i = s.length()-1; i >=0; i--){
            String ch = Character.toString(s.charAt(i));
            newstring = newstring + ch;
        }

//        reverse String is newstring
        System.out.println(newstring);
    }


    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        revstring(s);
    }
}
