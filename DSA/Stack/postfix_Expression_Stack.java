import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}

class Stack {
    Node top;
    Stack(){
        top = null;
    }

    void push(int val){
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if (top == null){
            System.out.println("Stack Underflow!");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    boolean isEmpty(){
        return top == null;
    }
  
}

public class postfix_Expression_Stack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        String exp = sc.next();   

      	for(int i=0;i<exp.length();i++){
            char c =exp.charAt(i);
            if(Character.isDigit(c)){
                st.push(c-'0');
            }else{
                int b=st.pop();
                int a=st.pop();
                switch(c){
                    case '+':st.push(a+b);
                        break;
                    case '-':st.push(a-b);
                        break;
                    case '*':st.push(a*b);
                        break;
                    case '/':st.push(a/b);
                        break;     
                }
            }
            
        }
        System.out.print(st.pop());
      
    }
}