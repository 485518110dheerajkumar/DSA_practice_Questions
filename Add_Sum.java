import java.util.*;

public class Add_Sum {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class Allfunction{
        Node head = null;
        Node tail = null;

//             ----------------     Adding the node in the end
        void Addnodeinlast(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
            }else{
                tail.next = newnode;
            }
            tail = newnode;
        }

//        ----------------   size of linked List
        int size(){
            int count = 0;
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }

//        -----------------  Removing the node from anywhere in the linked list

        void remove(int idx){
            Node temp = head;
            if(temp == null){
                System.out.println("Invalid Index");
            }else if(idx ==size()){
                System.out.println("Index is not present");
            }else{
                
            }
        }

//         ----------------      display the linked list
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +" " + "-->" +" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        Allfunction ll = new Allfunction();
        for(int i = 0; i < 5; i++){
            int s = scn.nextInt();
            ll.Addnodeinlast(s);
        }
//        ll.display();
        int ind = scn.nextInt();
        ll.remove(ind);
        ll.display();



    }

}
