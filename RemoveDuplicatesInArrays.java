import java.util.*;

public class RemoveDuplicatesInArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i = 0; i < arr.length; i++){
            int freq = 1;
            if(map.containsKey(arr[i])){
                freq = map.get(arr[i]) + 1;
                map.replace(arr[i],freq);
            }else{
                map.put(arr[i],freq);
            }
        }
        for(int val: map.keySet()){

            if(map.get(val) == 2){
                list.add(val);
            }
        }
        System.out.println(list);
    }
}
