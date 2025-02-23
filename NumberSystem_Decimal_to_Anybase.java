import java.util.Scanner;

public class NumberSystem_Decimal_to_Anybase {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int dig = scn.nextInt();
//        int base1 = scn.nextInt();

        int base2 = scn.nextInt();
        int newdig = 0;
         int pow = 1;
        while(dig > 0){
            int num = dig % base2;
            dig = dig / base2;

            newdig += num * pow;
            pow = pow * 10;
        }
        System.out.println(newdig);
    }
}
