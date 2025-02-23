import java.util.Scanner;

public class FabonacciNumbers {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n<2){
            System.out.println("0");
        }else{
            int a = 0;
            System.out.println(a);
            int b = 1;
            System.out.println(b);
            for(int i = 3; i <= n; i++){
                int c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}
