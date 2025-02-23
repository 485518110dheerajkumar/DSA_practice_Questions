import java.util.Scanner;

public class Xpower {
    public static int calpower(int n, int X){
        if(n==0){
            return 1;

        }
        if(X == 0){
            return 0;
        }
        int xpowerm1 = calpower(n-1, X);
        int xpower = X * xpowerm1;
        return xpower;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();
        int calpow = calpower(n,X);
        System.out.println(calpow);
    }
}
