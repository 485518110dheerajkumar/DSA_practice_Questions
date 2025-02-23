import java.util.Scanner;

public class NumberSystem_Anybase_Addition {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int sum = 0;
        int carray = 0;
        int pow = 1;
        while(n1 > 0 || n2 >0 || carray > 0){

            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int temp = rem1 + rem2 + carray;
            carray = temp / base;
            temp = temp % base;

            sum += temp * pow;
            pow = pow * 10;

        }
        System.out.println(sum);
    }
}
