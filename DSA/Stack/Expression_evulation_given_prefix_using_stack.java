import java.util.*;
public class Expression_evulation_given_prefix_using_stack{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      String prefix=sc.next();
      Stack <Integer>st=new Stack<>();
      for(int i=prefix.length()-1;i>=0;i--){
         char ch=prefix.charAt(i);
         if(Character.isDigit(ch)){
            st.push(ch-'0');
         }else{
            int a=st.pop();
            int b=st.pop();
            
            switch(ch){
               case '+':st.push(a+b);break;
               case '-':st.push(a-b);break;
               case '*':st.push(a*b);break;
               case '/':st.push(a/b);break;
            }
         }
      }
      System.out.print(st.pop());
   }
}