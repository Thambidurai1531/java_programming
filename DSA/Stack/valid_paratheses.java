import java.util.*;
public class valid_paratheses{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean flag=true;
        Stack<Character>st=new Stack<>();
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
        System.out.println(flag?"valid":"invalid");
    }
}