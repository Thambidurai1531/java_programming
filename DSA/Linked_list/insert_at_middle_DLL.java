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
class LinkedList{
   Node head=null;
   void insert(int val){
      Node newNode=new Node(val);
      if(head==null){
         head = newNode;
      }else{
         Node temp=head;
         while(temp.next!=null){
            temp=temp.next;
         }
         temp.next=newNode;
         newNode.prev=temp;
      }
   }
   void insertBeg(int val){
      Node newNode=new Node(val);
      
      if(head==null){
         head=newNode;
      }else{
      newNode.next=head;
      head.prev=newNode;
      head=newNode;
      }
   }
   void insertEnd(int val){
      Node newNode=new Node(val);
      Node temp=head;
      if(head==null){
         System.out.print("empty...");
      }
      while(temp.next!=null){
         temp=temp.next;
      }
      temp.next=newNode;
      newNode.prev=temp;
      System.out.println();
   }
   void insertAtmiddle(int val){
      Node newNode=new Node(val);
      if(head==null){
         head=newNode;
         return;
      }
      int count=0;
      Node temp=head;
      while(temp!=null){
         count++;
         temp=temp.next;
      }
      int mid=(count+1)/2;
      temp=head;
      for(int i=1;i<mid;i++){
         temp=temp.next;
      }
      newNode.next=temp.next;
      if(temp.next!=null){
         temp.next.prev=newNode;
      }
      temp.next=newNode;
      newNode.prev=temp;
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
   }
}
public class insert_at_middle_DLL{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      LinkedList ll=new LinkedList();
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
         int v = sc.nextInt();
         ll.insert(v);
      }
      int k=sc.nextInt();
   //    ll.insertBeg(k);
   //  ll.insertEnd(k);
     ll.insertAtmiddle(k);
      ll.displayforward();
      ll.displaybackward();
      
   }
}