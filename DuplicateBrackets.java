import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static boolean symbool(Stack<Character> st, char corrosponding){
        if(st.size() == 0){
            return false;
        }else if(st.peek() != corrosponding){
            return false;
        }else{
            st.pop();
            return true;
        }
    }


    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
        HashSet<Integer> ls = new HashSet<>();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < n.length(); i++){
            char ch = n.charAt(i);
            if(ch =='(' || ch =='{' || ch == '['){
                st.push(ch);
            }else if(ch == ')'){
                boolean val = symbool(st,'(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }else if(ch == '}'){
                boolean val = symbool(st,'{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }else if(ch == ']'){
                boolean val = symbool(st,'[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
        }
        if(st.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
