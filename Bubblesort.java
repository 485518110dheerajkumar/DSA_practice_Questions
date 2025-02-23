import java.util.Scanner;

public class Bubblesort {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i =0; i < n; i++){
            array[i] = sc.nextInt();
        }
//        int array[] = {1 ,8 ,3 ,11 ,5 ,6};
//        Bubble sort code


        for(int i = 0; i < array.length - 1; i++){
            for(int  j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for(int k = 0; k < array.length ; k++){
            System.out.print(array[k]+ " ");
        }
    }
}
