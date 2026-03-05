import java.util.*;
class Node{
   char data;
   Node next;
   Node(char val){
      this.data=val;
      this.next=null;
   }
}
class Linkedlist_Stack{
   Node top=null;
   void push(char val){
      Node newnode=new Node(val);
      if(top==null){
         top=newnode;
      }else{
         newnode.next=top;
         top=newnode;
      }
   }
   char pop(){
      if(top==null){
         return '\0';
      }
      char val=top.data;
      top=top.next;
      return val;
   }
   // char peek(){
   //    System.out.print(top.data);
   // }
   boolean isEmpty(){
      return top==null;
   }
   void display(){
      Node temp=top;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
   }
}
public class reverse_string_using_stack{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Linkedlist_Stack ll=new Linkedlist_Stack();
      String str=sc.next();
      for(int i=0;i<str.length();i++){
         ll.push(str.charAt(i));
      }
      String rev="";
      while(!ll.isEmpty()){
         rev+=ll.pop();
      }
      System.out.print(rev);
      //ll.display();
   }
}
   