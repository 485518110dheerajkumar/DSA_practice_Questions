import java.util.*;
public class Arraylist {


    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> str = new ArrayList<String>();

//        Add elements in integer arraylist
        list.add(1);
        list.add(2);
        str.add("name");
        str.add("Apple");

        System.out.println(str +" "+ list);

//        geting the elements
        int element = list.get(0);
        String s = str.get(0);
        System.out.println(s + " "+ element);

//        add elements inn between

        list.add(1,5);
        str.add(1,"class");
        System.out.println(str + " "+ list);

//        set elements in Arraylist

        list.set(0,15);
        str.set(0,"dheeraj");
        System.out.println(str + " "+ list);

//        on deletinng the elements inn Arraylist

        list.remove(0);
        str.remove(0);
        System.out.println(str + " "+ list);

//        on printing the size of the Arraylist
        int n = list.size();
        int k = str.size();
        System.out.println(n + " "+ k);

//        on printing the Arraylist elements with the help of for loop
        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
        for(int i = 0; i < str.size(); i++){
            System.out.println(str.get(i));
        }

//        sorting the Arraylist

        Collections.sort(list);
        Collections.sort(str);
        System.out.println(str + " "+ list);

    }
}
