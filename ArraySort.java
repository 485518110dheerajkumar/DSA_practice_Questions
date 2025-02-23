import java.util.*;
public class ArraySort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int ans = 0;
        Arrays.sort(arr);
        ArrayList<Integer> ls = new ArrayList<>();
        for(int val:arr){
            if(val < 0){
                continue;
            }else{
                ls.add(val);
            }
        }
        System.out.println(ls);

        int l = ls.get(0);
        System.out.println(l);
        int h = ls.get(ls.size() - 1) + 2;
        System.out.println(h);
        while(l != h){
            if(!ls.contains(l)){
                ans = l;
                break;
            }
            l++;
        }
        System.out.println(ans);

    }
}
