import java.util.*;
class Node{
   int data;
   Node prev;
   Node next;
   Node(int val){
      this.data=val;
      this.next=null;
      this.prev=null;
   }
}
class LinkedList{
   Node head=null;
   void insert(int val){
      Node newNode=new Node(val);
      if(head==null){
         head=newNode;
         newNode.prev=head;
      }else{
         Node temp=head;
         while(temp.next!=null){
            temp=temp.next;
         }
         temp.next=newNode;
         newNode.prev=temp;
      }
   }
   void insertend(int val){
      Node newnode=new Node(val);
      if(head==null){
         head=newnode;
         return;
      }else{
      Node temp=head;
      while(temp.next!=null){
         temp=temp.next;
      }
      temp.next=newnode;
   }
   }
   void insertbeg(int val){
      Node newnode=new Node(val);
      if(head==null){
         newnode=head;
         return;
      }
      newnode.next=head;
      head.prev=newnode;
      head=newnode;
   }
   void delete(int k){
      if(head.data==k){
         head=head.next;
      }
      Node temp=head;
      while(temp!=null&&temp.next!=null){
         if(temp.next.data==k){
            temp.next=temp.next.next;
         }
         temp=temp.next;
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
public class Delete_a_given_value_DLL{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      LinkedList ll=new LinkedList();
      for(int i=0;i<n;i++){
         int v=sc.nextInt();
         ll.insert(v);
      }
      //int v=sc.nextInt();
      //ll.insertbeg(v);
       //ll.insertend(v);
      int k=sc.nextInt();
      ll.delete(k);
      ll.display();
   }
}