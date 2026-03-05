import java.util.*;
class Node{
   char data;
   Node next;
   Node(char val){
      this.next=null;
      this.data=val;
   }
}
class stack{
   Node top=null;
   void push(char val){
      Node newnode=new Node(val);
      // if(top==null){
      //    top=newnode;
      // }
      newnode.next=top;
      top=newnode;
   }
   int pop(){
      if(top==null){
         System.out.print("stack is empty");
         
      }
      char val=top.data;
      top=top.next;
      return val;
   }
   int peek(){
      if(top==null){
         System.out.print("stack is empty");
         
      }
      return top.data;
   }
   int size(){
      Node temp=top;
      int count=0;
      while(temp!=null){
         count++;
         temp=temp.next;
      }
      return count;
   }
   void printreverse(Node node){
      if(node==null)
      return;
      printreverse(node.next);
      System.out.print(node.data);
   }
   void display(){
     printreverse(top);
     System.out.println();
   }
   
}
public class Generate_Parentheses_stack{
   static void  generate(stack s,int open,int close,int n){
      if(s.size()==2*n){
         s.display();
         return;
      }
      if (open<n){
            s.push('(');
            generate(s, open + 1, close, n);
            s.pop();  
        }
        if (close<open){
            s.push(')');
            generate(s, open, close + 1, n);
            s.pop();  
        }
      
   }
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      stack s=new stack();
      generate(s,0,0,n);
     
   }
}