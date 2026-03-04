import java.util.*;
class Node{
   int data;
   Node next;
   Node(int val){
      this.data=val;
      this.next=null;
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
   void rotate(int k){
      Node temp=head;
      int count=1;
      while(temp.next!=null){
         count++;
         temp=temp.next;
      }
      temp.next=head;
       k=k%count;
      for(int i=0;i<count-k;i++){
         temp=temp.next;
      }
      head=temp.next;
      temp.next=null;
      
   }
   void display(){
      Node temp=head;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
   }
}
public class kth_left_rotation_in_LL{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Linkedlist ll=new Linkedlist();
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
         int k=sc.nextInt();
         ll.insert(k);
      }
      ll.rotate(sc.nextInt());
      ll.display();
   }
}
