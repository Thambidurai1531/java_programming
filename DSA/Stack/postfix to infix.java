import java.util.Scanner;
class Stack{
    
    String[]stack=new String[100];
    int top=-1;
    void push(String str){
        stack[++top]=str;
        
    }
    String pop(){
       
        return stack[top--];
    }
    String peek(){
        
         return stack[top];
    }
    boolean isEmpty(){
        return top == -1;
    }
    
   String convert(String postfix){
       String infix="";
       for(int i=0;i<postfix.length();i++){
           char ch=postfix.charAt(i);
           if(Character.isLetterOrDigit(ch)){
               push(ch+" ");
           }
           else{
               String operand2=pop();
               String operand1=pop();
               String temp="("+operand1+ch+operand2+")";
               push(temp);
           }
       }
           return pop();
   }
   }
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        String postfix=sc.nextLine();
        String infix=st.convert(postfix);
        System.out.print(infix);
    }
}
