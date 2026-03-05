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
      // if(top==null){
      //    return '\0';
      // }
      newnode.next=top;
      top=newnode;
   }
   char pop(){
      char val=top.data;
      top=top.next;
      return val;
   }
   boolean isEmpty(){
      return top==null;
   }
   char peek(){
      if(top==null){
         return '\0';
      }
         
      return top.data;
   }
}
public class infix_to_postfix{
   static int prec(char ch){
      if(ch=='+'||ch=='-') return 1;
      if(ch=='*'||ch=='/') return 2;
      if(ch=='^') return 3;
      return -1;
   }
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      String infix=sc.next();
      Stack st=new Stack();
      String post="";
      for(char c:infix.toCharArray()){
         if(Character.isLetterOrDigit(c)){
            post+=c;
         }else if(c=='('){
            st.push(c);
         }else if(c==')'){
            while(!st.isEmpty()&&st.peek()!='('){
               post+=st.pop();
            }
            st.pop();
         }else{
            while(!st.isEmpty()&&prec(st.peek())>=prec(c)){
               post+=st.pop();
            }
            st.push(c);
         }
      }
      while(!st.isEmpty()){
         post+=st.pop();
      }
      System.out.print(post);
   }
}
