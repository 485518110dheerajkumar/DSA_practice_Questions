import java.util.Scanner;

public class Digits_Frequency {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int dig = scn.nextInt();
        int freq = scn.nextInt();
        int count = 0;
        while(dig > 0){
            int rv = dig % 10;
            dig = dig / 10;
            if(rv == freq){
                count++;
            }
        }
        System.out.println(count);
    }
}
