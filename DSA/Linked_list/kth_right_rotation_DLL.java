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
   void Rotateright(int k){
      
      if(head==null||head.next==null||k==0){
         return;
      }
      Node temp=head;
      int count=1;
      while(temp.next!=null){
         temp=temp.next;
         count++;
      }
      Node tail=temp;
      k=k%count;
      if(k==0){
         return;
      }
      temp=head;
      for(int i=1;i<count-k;i++){
         temp=temp.next;
      }
      Node newhead=temp.next;
      
      temp.next=null;
      newhead.prev=null;
      
      tail.next=head;
      head.prev=tail;
      
      head=newhead;
      
   }
   void display(){
      Node temp=head;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
   }
}
public class kth_right_rotation_DLL{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Linkedlist ll=new Linkedlist();
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
         int v=sc.nextInt();
         ll.insert(v);
      }
          int k=sc.nextInt();
         ll.Rotateright(k);
         ll.display();
   }
}