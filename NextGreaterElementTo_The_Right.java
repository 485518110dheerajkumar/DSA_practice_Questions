import java.util.Scanner;
import java.util.*;

public class NextGreaterElementTo_The_Right {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int newarr[] = new int[arr.length];
        st.push(arr[arr.length - 1]);
        newarr[newarr.length - 1] = -1;
        for(int j = arr.length - 2; j >= 0; j-- ){

            while(st.size() > 0 && arr[j] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                newarr[j] = -1;
            }else{
                newarr[j] = st.peek();
            }
            st.push(arr[j]);

        }
//        On Printing the new Array elements

        for(int val:newarr){
            System.out.print(val+" ");
        }
    }
}
