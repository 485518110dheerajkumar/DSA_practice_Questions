import java.util.*;

public class CommenChar {
    public static void main(String args[]){

        String arr[] = {"flower", "float", "flying"};
        HashMap<Character, Integer> map = new HashMap<>();
        int freq = 1;
        for(int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length(); i++) {
                if(map.containsKey(arr[j].charAt(i))){
                    map.put(arr[j].charAt(i), map.get(arr[j].charAt(i))+1);
                }else{
                    map.put(arr[j].charAt(i),freq);
                }
            }
        }

        for(Map.Entry<Character,Integer> ls : map.entrySet()){
            if(ls.getValue() >= 3){
                System.out.print(ls.getKey());
            }
        }
    }
}
