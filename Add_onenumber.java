import java.util.*;
public class Add_onenumber {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 17};

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i< arr.length; i++){
            if(i == arr.length-1){
                int dig = arr[arr.length-1]+1;
                if(dig<10){
                    list.add(dig);
                }else{
                    int numb = dig / 10;
                    int numb2 = dig%10;
                    list.add(numb);
                    list.add(numb2);
                }
            }else{
                list.add(arr[i]);
            }
        }
        System.out.println(list);



    }
}
