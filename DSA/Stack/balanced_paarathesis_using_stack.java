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
public class balanced_paarathesis_using_stack{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      Stack st=new Stack();
      String s=sc.next();
      boolean flag=true;
      for(char ch:s.toCharArray()){
            if(ch=='{'||ch=='['||ch=='('){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    flag=false;
                    break;
                }
                char top=st.pop();
                if((ch==')'&&top!='(')||(ch==']'&&top!='[')||(ch=='}'&&top!='{')){
                    flag=false;
                    break;
                }
            }
        }
        if(!st.isEmpty())flag=false;
        System.out.println(flag?"Balanced":"Not Balanced");
   }
}