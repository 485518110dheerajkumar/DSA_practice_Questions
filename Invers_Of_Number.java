import java.util.Scanner;

public class Invers_Of_Number {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int invers = 0;
        int orignalPosition = 1;
        while(n != 0){
            int orignalDigit = n%10;
            int initialDigit = orignalPosition;
            int initialPosition = orignalDigit;
            invers = invers + initialDigit*(int)Math.pow(10, initialPosition-1);
            n = n / 10;
            orignalPosition++;
        }
        System.out.println(invers);
    }
}
