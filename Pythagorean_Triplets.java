import java.util.Scanner;

public class Pythagorean_Triplets {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        int max = n1;
        if(n2 >= max){
            max = n2;
        }
        if(n3 >= max){
            max = n3;
        }

        if(max == n1){
            boolean flag = ((n2 * n2) + ( n3 * n3) == (n1 * n1));
            System.out.println(flag);
        }else if(max == n2){
            boolean flag = ((n1 * n1) + (n3 * n3) == (n2 * n2));
            System.out.println(flag);
        }else{
            boolean flag = ((n1 * n1) + (n2 * n2) == (n3 * n3));
            System.out.println(flag);
        }
    }
}
