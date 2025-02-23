import java.util.*;
public class CheckSubsetOrNot {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 8, 9, 10, 14};
        int b[] = {2,8,10};
        boolean ans = false;
        ArrayList<Integer> ls = new ArrayList<>();
        Arrays.sort(a);
        for(int val:a){
            ls.add(val);
        }

        Arrays.sort(b);
        for(int bval:a){
            int l = 0;
            int h = b.length;
            while(l <= h){
                int m = (l + h) / 2;
                if(b[m] < bval){
                    l = m + 1;
                    ans = false;
                }else if(b[m] > bval){
                    ans = true;
                    break;
                }else{
                    h = m - 1;
                    ans = false;
                }

            }
        }

//        for(int num:b){
//            if(ls.contains(num)){
//                int idx = ls.indexOf(num);
//                ans = true;
//                ls.remove(idx);
//
//            }else{
//                ans = false;
//                break;
//            }
//        }




        System.out.println(ans);
    }
}
