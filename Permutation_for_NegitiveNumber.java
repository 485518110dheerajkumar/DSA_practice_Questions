import java.util.*;
import static java.lang.Integer.parseInt;
public class Permutation_for_NegitiveNumber {
    public static void main(String[] args) {
        int arr[] = {0, -1, 2};
        System.out.println(permute(arr));
    }
        public static List<List<Integer>> permute(int[] nums) {
//                                                           ------------------         Array to string
            String s = "";
            for(int i = 0; i < nums.length; i++){
                s = Integer.toString(nums[i]) + s;
            }
//                                                           -----------------        ArrayList for permutations
            ArrayList<String> list = new ArrayList<>();
            permu(list,"",s);
//                                                          ------------------        storing the ArrayList
            List<List<Integer>> ls = new ArrayList<>();

//
//                                                           -----------------       Adding elements in sub ArrayList

            for(int i = 0; i < list.size(); i++){
                ArrayList<Integer> sub = new ArrayList<>();
                String lstr = list.get(i);
                String ch = "";
                int idx = -1;
                for(int j = 0; j < lstr.length(); j++){
                    if(idx == j){
                        continue;
                    }
                    if(lstr.charAt(j) =='-'){
                        ch = "-"+ Character.toString(lstr.charAt(j+1));
                        idx = j + 1;
                    }else{
                        ch = Character.toString(lstr.charAt(j));
                    }
                    int gk = parseInt(ch);
                    sub.add(gk);
                }
                ls.add(sub);
            }



            return ls;
        }

        public static void permu(ArrayList<String> list,String c,String s){
            if(s.length() == 0){
                list.add(c);
                return;
            }
            int idx = -1;
            for(int i = 0; i < s.length(); i++){
                String ch = "";
                String lstr = "";
                String rstr = "";
                if(idx == i){
                    continue;
                }

                if(s.charAt(i) == '-'){

                    ch = "-"+ Character.toString(s.charAt(i+1));
                    idx = i + 1;
                    lstr = s.substring(0,idx-1);
                    rstr = s.substring(idx + 1);


                }else{
                    ch = Character.toString(s.charAt(i));
                    lstr = s.substring(0,i);
                    rstr = s.substring(i + 1);
                }

                String newstring = lstr + rstr;
                permu(list,c+ch,newstring);
            }
        }

}
