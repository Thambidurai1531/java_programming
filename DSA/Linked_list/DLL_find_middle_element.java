import  java.util.*;
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
class Linkedlist{
   Node head=null;
   void insert(int val){
      Node newNode=new Node(val);
      if(head==null){
         head=newNode;
      }else if(head.next==null){
         head.next=newNode;
      }else{
         Node temp=head;
         while(temp.next!=null){
            temp=temp.next;
         }
         temp.next=newNode;
         newNode.prev=temp;
      }
   }
   void middleElement(){
      Node temp=head;
      int count=0;
      while(temp!=null){
         count++;
         temp=temp.next;
      }
      int mid=(count+1)/2;
      temp=head;
      for(int i=1;i<mid;i++){
         temp=temp.next;
      }
      System.out.print(temp.data+" ");
      System.out.println();
   }
   void display(){
      if(head == null){
         System.out.println("underflow");
      }
      Node temp=head;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
   }
}
public class DLL_find_middle_element{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Linkedlist ll=new Linkedlist();
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
         int v=sc.nextInt();
         ll.insert(v);
      }
      ll.middleElement();
      //ll.display();
   }
}