import java.util.HashSet;

public class Union_HashSet {
    public static void main(String args[]){
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {7,8,9,6,2,4,5,3};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);

        }
        for(int j = 0; j< arr2.length; j++){
            set.add(arr2[j]);

        }

        System.out.println(set);

    }
}
