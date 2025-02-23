import java.util.Scanner;

public class GCD_and_LCM {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int orignaln1 = n1;
        int orignaln2 = n2;
//        GCD of two number

        while(n1%n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;

        }
        int gcd = n2;

//        LCM of two number

        int lcm = (orignaln1 * orignaln2) / gcd;

        System.out.println("LCM and GCD of "+n1 +" and "+n2+ " is : "+ lcm +","+gcd );
    }
}
