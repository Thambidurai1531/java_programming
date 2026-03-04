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
      }else{
         Node temp=head;
         while(temp.next!=null){
            temp=temp.next;
         }
         temp.next=newNode;
         newNode.prev=temp;
      }
   }
   void deleteBeg(){
      if(head==null){
         head=null;
      }else{
         head=head.next;
         head.prev=null;
      }
   }
   void deleteEnd(){
      if(head==null){
         System.out.println("empty...List...");
      }
      else if(head.next==null){
         head=null;
      }else{
         Node temp=head;
         while(temp.next.next!=null){
            temp=temp.next;
         }
         temp.next=null;
         
      }
   }
   void deleteMiddle(){
      Node temp=head;
      if(head==null){
         
      }else if(head.next==null){
         head=null;
      }else{
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
      if(temp.prev!=null){
         temp.prev.next=temp.next;
      }
      if(temp.next!=null){
         temp.next.prev=temp.prev;
      }
      }
   }
   void displayforward(){
      Node temp=head;
      while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
      }
      System.out.println();
   }
   void displaybackward(){
      Node temp=head;
      while(temp.next!=null){
         temp=temp.next;
      }
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.prev;
      }
      System.out.println();
   }
}
public class Delete_at_middle_DLL{
public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      Linkedlist ll=new Linkedlist();
      for(int i=0;i<n;i++){
      int v=sc.nextInt();
      ll.insert(v);
      }
       //ll.deleteBeg();
      // ll.deleteEnd();
      ll.deleteMiddle();
     ll.displayforward();
     ll.displaybackward();
   }
}