import java.util.Scanner;

public class FactorialUsin_Recursion {
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        int nmofact = fact(n-1);
        int factans = n * nmofact;
        return factans;
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int l = fact(n);
        System.out.println(l);
    }
}
