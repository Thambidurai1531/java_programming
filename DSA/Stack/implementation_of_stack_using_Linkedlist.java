import java.util.*;
class Node{
   int data;
   Node next;
   Node(int val){
      this.data=val;
      this.next=null;
   }
}
class Linkedlist_Stack{
   Node top=null;
   void push(int val){
      Node newnode=new Node(val);
      if(top==null){
         top=newnode;
      }else{
         newnode.next=top;
         top=newnode;
      }
   }
   void pop(){
      if(top==null){
         return;
      }
      top=top.next;
   }
   void peek(){
      System.out.print(top.data);
   }
   void display(){
      Node temp=top;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
   }
}
public class implementation_of_stack_using_Linkedlist{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Linkedlist_Stack ll=new Linkedlist_Stack();
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
         ll.push(sc.nextInt());
      }
      ll.display();
   }
}
   