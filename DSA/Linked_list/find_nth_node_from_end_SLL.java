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
   void removeduplicate(){
      Node cur=head;
      while(cur!=null){
         Node temp=cur;
         while(temp.next!=null){
            if(temp.next.data==cur.data){
               temp.next=temp.next.next;
            }else{
               temp=temp.next;
            }
         }
         cur=cur.next;
      }
   }
   void findnthnode(int val){
      Node temp=head;
      int count=0;
      while(temp!=null){
         count++;
         temp=temp.next;
      }
      int last=count-val;
      temp =head;
      for(int i=0;i<last;i++){
         temp=temp.next;
      }
      System.out.print(temp.data+" ");
   }
   void display(){
      Node temp=head;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
   }
}
public class find_nth_node_from_end_SLL{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Linkedlist ll=new Linkedlist();
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
         int v=sc.nextInt();
         ll.insert(v);
      }
      //ll.removeduplicate();
      int t=sc.nextInt();
      ll.findnthnode(t);
      //ll.display();
   }
}