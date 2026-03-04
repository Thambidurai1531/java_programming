import java.util.*;
class Node{
   int data;
   Node prev;
   Node next;
   Node(int val){
      this.data=val;
      this.prev=null;
      this.next=null;
   }
}
class Linkedlist{
   Node head=null;
   void insert(int val){
      Node newNode=new Node(val);
      if(head==null){
         head=newNode;
      }
       else if (head.next==null){
          head.next=newNode;
          }
         else{
         Node temp=head;
         while(temp.next!=null){
            temp=temp.next;
         }
         temp.next=newNode;
         newNode.prev=temp;
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
public class DLL_implementation{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Linkedlist ll=new Linkedlist();
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
         int v=sc.nextInt();
         ll.insert(v);
      }
         ll.display();
   }
}