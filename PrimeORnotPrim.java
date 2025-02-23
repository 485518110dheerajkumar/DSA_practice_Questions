import java.util.*;
public class PrimeORnotPrim {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
            int num = scn.nextInt();
            int count = 0;
            for(int j = 1; j <= num; j++){
                if(num%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("number is Prime");
            }else{
                System.out.println("Number is Not Prime");
            }

        }

    }
}
