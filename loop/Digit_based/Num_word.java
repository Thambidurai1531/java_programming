import java.util.Scanner;
class Num_word{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  String[] w={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
  for(int i=0;i<s.length();i++)
   System.out.print(w[s.charAt(i)-'0']+" ");
 }
}