import java.util.*;
class Node{
   int data;
   Node next;
   Node prev;
   Node(int val){
      this.data=val;
      this.next=null;
      this.prev=null;
   }
}
class Linkedlist{
   Node head=null;
   void insert(int val){
      Node newnode=new Node(val);
      if(head==null){
         head=newnode;
      }else{
         Node temp=head;
         while(temp.next!=null){
            temp=temp.next;
         }
         temp.next=newnode;
      }
   }
   void zigzag() {
    if (head == null || head.next == null) return;
    Node left = head;
    Node right = head;

    while (right.next != null && right.next.next != null) {
        left = left.next;
        right = right.next.next;
    }
    right = left.next; 
    left.next = null;

    Node prev = null;

    while (right != null) {
        Node next = right.next;
        right.next = prev;
        prev = right;
        right = next;
    }
    left = head;
    right = prev;

    while (right != null) {
        Node nextL = left.next;
        Node nextR = right.next;

        left.next = right;
        right.next = nextL;

        left = nextL;
        right = nextR;
    }
}
   void sort(){
      Node curr=head;
      while (curr!=null){
      Node temp=head;
      while(temp.next!=null){
         if(temp.data>temp.next.data){
            int t=temp.data;
            temp.data=temp.next.data;
            temp.next.data=t;
         }
         temp=temp.next;
      }
      curr=curr.next;
   }
      
   }
   void display(){
      Node temp=head;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
   }
}
public class Zig_zag_FLFL_SLL{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Linkedlist ll=new Linkedlist();
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
         ll.insert(sc.nextInt());
      }
      //ll.sort();
      ll.zigzag();
      ll.display();
   }
}