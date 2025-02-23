import java.util.Scanner;

public class TowerOfHanoi_UsingRecursion {


    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int nodisc = scn.nextInt();
        String ftowername = scn.next();
        String stowername = scn.next();
        String ttowername = scn.next();
        Tower(nodisc, ftowername,stowername,ttowername);
    }

    private static void Tower(int disc, String start, String end, String help) {

        if(disc == 0){
            return;
        }
        Tower(disc - 1, start, help, end);
        System.out.println(disc + " "+ start + " "+ end);
        Tower(disc -1, end, help, start);
    }
}
