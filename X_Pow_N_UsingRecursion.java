import java.util.Scanner;

public class X_Pow_N_UsingRecursion {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = xpown(x,n);
        System.out.println(ans);
    }

    private static int xpown(int x, int n) {
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xpowmo = xpown(x,n-1);
        int xpownans = x * xpowmo;
        return xpownans;
    }
}
