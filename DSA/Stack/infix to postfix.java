import java.util.Scanner;
class Stack{ 
    char[]stack=new char[100];
    int top=-1;
    void push(char ch){
        stack[++top]=ch;     
    }
    char pop(){
        return stack[top--];
    }
    char peek(){
         return stack[top];
    }
    boolean isEmpty(){
        return top == -1;
    }
    int precedence(char ch){
        if(ch=='+'||ch=='-')return 1;
        else if(ch=='*'||ch=='/')return 2;
        else if(ch=='^')return 3;
        else return -1;
    }
   String convert(String infix){
       String postfix="";
       for(int i=0;i<infix.length();i++){
           char ch=infix.charAt(i);
           if(Character.isLetterOrDigit(ch)){
               postfix+=ch;
           }
           else if(ch=='('){
               push(ch);
           }
           else if(ch==')'){
               while(!isEmpty()&&peek()!='('){
               postfix+=pop();
           }
           pop();
           }
           else{
               while(!isEmpty()&&precedence(peek())>=precedence(ch)){
                   postfix+=pop();
               }
               push(ch);
           }
   }
 while(!isEmpty()){
     postfix+=pop();
   }
   return postfix;
   }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        String infix=sc.nextLine();
        String postfix=st.convert(infix);
        System.out.print(postfix);
    }
}