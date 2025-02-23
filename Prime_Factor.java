import java.util.Scanner;

public class Prime_Factor {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        for(int div = 2; div * div <= n1; div++){
            while(n1 % div == 0){
                n1 = n1 / div;
                System.out.println(div);
            }
        }
        if(n1 != 1){
            System.out.println(n1);
        }
    }
}
