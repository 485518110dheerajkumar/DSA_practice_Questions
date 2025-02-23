import java.util.*;

public class MjorityElementsInArrays {
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
        int max = 0;
        int maxno = -1;
        for(int val: map.keySet()){
            if(max < map.get(val)){
                max = map.get(val);
                maxno = val;
            }

        }
        System.out.println(maxno);
    }
}
