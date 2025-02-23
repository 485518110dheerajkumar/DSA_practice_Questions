import java.util.Scanner;

public class Array {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number =  sc.nextInt();
        int Arr [] = new int[number];

//        Taking Elements from the user
        for(int i = 0; i < number ; i++){
            Arr[i] = sc.nextInt();
        }

//        Printing the values in Array

        for(int j = 0; j < number ; j++){
            System.out.print(Arr[j]+" ");
        }

    }
}
