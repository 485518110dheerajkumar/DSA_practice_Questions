import java.util.*;

public class AddNodeAtendLinklist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
    }


    public static class Allfunctions{
        Node head = null;
        Node tail = null;



        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        void AddAtEnd(int n){
            Node temp = new Node(n);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }






    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Allfunctions li = new Allfunctions();
        for(int i = 0; i < 4; i++){
           int val = scn.nextInt();
            li.AddAtEnd(val);

        }
        li.display();
    }
}
