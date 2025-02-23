import java.util.*;

public class LinkedList {
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

//        Add node from any where

        void nodeaddanywhere(int data, int idx){
            Node t = new Node(data);
            Node temp = head;
            for(int i = 1; i <= idx - 1; i++){
               temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
//        Adding nodes At End

        void addNodeAtend(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

//        On counting the Size of our Linked List

        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
//        Displaying the Linked List
        void display(){
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

//         Taking All Elements from the user
        
        Scanner scn = new Scanner(System.in);
        Allfunctions ll = new Allfunctions();
        for(int i = 1; i <= 5; i++){
            int val = scn.nextInt();

            ll.addNodeAtend(val);
        }
        int d = scn.nextInt();
        int idx = scn.nextInt();


//         Function calling

        ll.display();
        ll.nodeaddanywhere(d,idx);
        ll.display();
    }
}
