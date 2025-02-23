import java.util.Scanner;

public class PrintZig_Zac_UsingRecursion {

    public static void ZigZac(int n){
        if(n == 0){
            return;
        }
        System.out.println("Pre"+" -> "+ n);
        ZigZac(n - 1);
        System.out.println("In"+" -> "+ n);
        ZigZac(n-1);
        System.out.println("Post"+ " -> "+n);

    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ZigZac(n);
    }
}
