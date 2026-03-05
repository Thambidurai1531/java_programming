import java.util.*;
class Node{
   char data;
   Node next;
   Node(char val){
      this.data=val;
      this.next=null;
   }
}
class Stack{
   Node top=null;
   void push(char val){
      Node newnode=new Node(val);
      if(top==null){
         top=newnode;
      }else{
         // Node temp=head;
         // while(temp.next!=null){
         //    temp=temp.next;
         // }
         // temp.next=newnode;
         newnode.next=top;
         top=newnode;
      }
   }
   void pop(){
      if(top==null){
         return;
      }else{
         
         char val=top.data;
          top=top.next;
          //System.out.print(top.data);
      }
      System.out.println();
   }
   void peek(){
      System.out.print(top.data);
      
   }
   void display(){
      Node temp=top;
      while(temp!=null){
         System.out.print(temp.data);
         temp=temp.next;
      }
   }
}
public class Stack_implementation_using_Linkedlist{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Stack ll=new Stack();
      //int n=sc.nextInt();
      String s=sc.next();
      for(int i=0;i<s.length();i++){
         //char ch=sc.next().charAt(0);
         //char ch = sc.next().charAt(0);
         ll.push(s.charAt(i));
      }
      ll.peek();
       ll.pop();
       ll.display();
   }
}