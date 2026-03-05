import java.util.*;
public class postfix_to_infix_coll{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      String post=sc.next();
      Stack <String>st=new Stack<>();
      for(char c:post.toCharArray()){
         if(Character.isLetterOrDigit(c)){
            st.push(c+"");
         }else{
            String s2=st.pop();
            String s1=st.pop();
            String exp="("+s1+c+s2+")";
            st.push(exp);
         }
      }
      System.out.print(st.pop());
   }
}