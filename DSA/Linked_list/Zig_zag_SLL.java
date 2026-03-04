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
   void zigzag(){
      if(head==null||head.next==null) return ;
      boolean flag=true;
      Node temp=head;
      while(temp.next!=null){
         if(flag){
            if(temp.data<temp.next.data){
               int t=temp.data;
               temp.data=temp.next.data;
               temp.next.data=t;
                }
            
         }else{
               if(temp.data>temp.next.data){
               int t=temp.data;
               temp.data=temp.next.data;
               temp.next.data=t;
                   }
            }
         
         flag=!flag;
       temp=temp.next;  
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
public class Zig_zag_SLL{
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