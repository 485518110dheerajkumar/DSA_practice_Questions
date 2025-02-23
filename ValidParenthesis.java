import java.util.ArrayList;

public class ValidParenthesis {
    public static void main(String args[]){
        String s = "({[)}]";
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }
        if(list.contains('(') && list.contains(')') && (list.contains('{') && list.contains('}')) && (list.contains('[') && list.contains(']'))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
