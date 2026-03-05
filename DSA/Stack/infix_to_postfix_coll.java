import java.util.*;
public class infix_to_postfix_coll{
   static int prec(char ch){
      if(ch=='+'||ch=='-') return 1;
      if(ch=='*'||ch=='/') return 2;
      if (ch=='^') return 3;
      return -1;
   }
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      String infix=sc.next();
      String post="";
      Stack<Character>st=new Stack<>();
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
         }
         else{
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