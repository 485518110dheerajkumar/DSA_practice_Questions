import java.util.Scanner;

public class Factorial {
    public static int calfact(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        int factnm1 = calfact(n-1);
        int ans = n * factnm1;
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = calfact(n);
        System.out.println(result);
    }
}
