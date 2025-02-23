import java.util.Scanner;

public class AddNodeAnyWhere {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class Node_List{
        Node head = null;
        Node tail = null;
        void Atend(int data){
            Node newnode = new Node(data);

            if(head == null){
                head = newnode;
            }else{
                tail.next = newnode;
            }
            tail = newnode;
        }
        void anynode(int data, int idx){
            Node newNode = new Node(data);
            Node temp = head;
            for(int i = 1; i <= idx - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String args[]){
        Node_List ls = new Node_List();
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Enter the "+i+ " index element");
            int val = scn.nextInt();
            ls.Atend(val);

        }
        int v = scn.nextInt();
        int id = scn.nextInt();

        ls.anynode(v,id);
        ls.display();
    }
}
