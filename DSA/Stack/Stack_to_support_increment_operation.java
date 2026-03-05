import java.util.*;
class StackArray{
   int max;
   int stack[];
   int top;
   StackArray(int va){
      max=va;
      stack=new int[max];
      top=-1;
   }
   void push(int val){
      if(top==max-1){
         System.out.print("overflow");
      }else{
          stack[++top]=val;
      }
   }
   int pop(){
      if(top==-1){
         System.out.print("empty..");
         return -1;
      }else{
         return stack[top--];
      }
   }
   void increment(int k,int val){
      int n=Math.min(k,max);
      for(int i=0;i<n;i++){
         stack[i]+=val;
      }
   }
   void display(){
      for(int i=top;i>=0;i--){
         System.out.print(stack[i]+" ");
      }
   }
}
public class Stack_to_support_increment_operation{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      StackArray ll=new StackArray(n);
      for(int i=0;i<n;i++){
         int l=sc.nextInt();
         ll.push(l);
      }
      int k=sc.nextInt();
      int val=sc.nextInt();
      ll.increment(k,val);
      ll.display();
   }
}