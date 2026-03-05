import java.util.*;
class Node{
   int data;
   int max;
   Node next;
   Node(int val,int max){
      this.max=max;
      this.data=val;
      this.next=null;
   }
}
class Stack{
   Node top;
   void push(int x){
      if(top==null){
         top=new Node(x,x);
      }else{
         int currentmax=Math.max(x,top.max);
         Node newnode=new Node(x,currentmax);
      newnode.next=top;
      top=newnode;
      }
      
   }
   
   int getmax(){
      if(top==null){
         System.out.print("stack is empty");
         return -1;
      }
      return top.max;
   }
   int pop(){
      if(top==null){
         System.out.print("stack is empty");
         return -1;
      }
      int val=top.data;
      top=top.next;
      return val;
   }
   int peek(){
      if(top==null){
         System.out.print("stack is empty");
         return -1;
      }
      return top.data;
   }
   void display(){
      if(top==null){
         System.out.print("stack is empty");
         
      }
      Node temp=top;
      
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
      System.out.println();
   }
   
}
public class stack_push_pop_peek_max_constant_time_o_of_one{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Stack st=new Stack();
      System.out.print("1.push 2.pop 3.peek 4.display 5.min 6.Exit");
      while(true){
      switch(sc.nextInt()){
         case 1:
            int k=sc.nextInt();
            st.push(k);
            break;
         case 2:
            System.out.print("Popped : "+st.pop());
            break;
         case 3:
            System.out.print("Top : "+st.peek());
            break;
         case 4:
            st.display();
            break;
         case 5:
            System.out.print("min Element : "+st.getmax());
            break;
         case 6:
            System.exit(0);
      }
   }
   }
}