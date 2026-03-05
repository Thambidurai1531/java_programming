import java.util.Scanner;
class Node{
   int data;
   Node next;
   Node(int val){
      this.next=null;
      this.data=val;
   }
}
class Stack{
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
         return;
      }
      Node temp=top;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
   }
   boolean isEmpty(){
            return top==null;
      }
      void insertsort(int x){
         if(isEmpty()||peek()<=x){
            push(x);
            return;
         }
         int temp=pop();
         insertsort(x);
         push(temp);
      }
      void sortStack(){
         if(!isEmpty()){
            int temp=pop();
            sortStack();
            insertsort(temp);
         }
      }
      
}
public class sort_a_stack_using_recursion{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Stack st=new Stack();
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
         st.push(sc.nextInt());
      }
      // System.out.print("pop:"+st.pop());
      // System.out.print("peek:"+st.peek());
      // System.out.print("isEmpty:"+st.isEmpty());
      //st.display();
      st.sortStack();
      st.display();
   }
}