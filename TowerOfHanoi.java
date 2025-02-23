import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerofhanoi(int n, String src, String help, String dis){
        if(n == 1){
            System.out.println("Dick Transfer" + n +" from" + src + "To" + dis);
            return;
        }
        towerofhanoi(n-1, src,dis,help);
        System.out.println("Dick Transfer"+ n +" from" + src + "To" + dis);
        towerofhanoi(n-1,help,src,dis);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String src = sc.next();
        String help = sc.next();
        String dis = sc.next();

        towerofhanoi(n,src,help,dis);

    }
}
