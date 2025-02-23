import java.util.*;

public class AdditionOfTwo {
    public static void main(String args[]){

        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {4, 9, 5, 7};
        ArrayList<Integer> set = new ArrayList<Integer>();
        int carry = 0;
        for(int i = 0; i<arr1.length; i++){

            int addition = arr1[i] + arr2[i] + carry;

            if(addition < 10){
                set.add(addition);
            }else{
                int a = addition/10;
                carry = addition % 10;
                set.add(a);

            }
        }

        System.out.println(set);
    }
}
