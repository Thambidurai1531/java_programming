import java.util.*;
class StackArray{
   int max;
   int Stack[];
   int  top;
   StackArray(int n){
      max=n;
      Stack=new int[max];
      top=-1;
   }
   void push(int value){
      if(top==max-1){
         System.out.print("overflow");
      }else{
         Stack[++top]=value;
      }
   }
   void pop(){
      if(top==-1){
         System.out.print("overflow");
      }else{
         System.out.print(Stack[top--]);
      }
   }
   void peek(){
      if(top==-1){
         System.out.print("empty..");
      }else{
         System.out.print(Stack[top]);
      }
   }
   void display(){
      if(top==-1){
         System.out.print("stack is empty");
      }else{
         for(int i=top;i>=0;i--){
            System.out.print(Stack[i]);
         }
      }
   }
}
public class stack_array_implementation{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      StackArray s=new StackArray(n);
      while(true){
         int choice =sc.nextInt();
         switch(choice){
         case 1:
            int value=sc.nextInt();
            s.push(value);
            break;
         case 2:
            s.pop();
            break;
         case 3:
            s.peek();
            break;
         case 4:
            s.display();
            break;
         default :
             System.out.print("invalid..");
         }
      }
   
   }
}