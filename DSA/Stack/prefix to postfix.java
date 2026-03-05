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
        return top==-1;
    } 
   String convert(String prefix){
       String postfix="";
       for(int i=prefix.length()-1;i>=0;i--){
           char ch=prefix.charAt(i);
           if(Character.isLetterOrDigit(ch)){
               push(ch+"");
           }
           else{
               String operand1=pop();
               String operand2=pop();
               String temp=operand1+operand2+ch;
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
        String prefix=sc.nextLine();
        String postfix=st.convert(prefix);
        System.out.print(postfix);
    }
}
