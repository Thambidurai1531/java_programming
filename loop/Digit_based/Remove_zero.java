import java.util.Scanner;
class Remove_zero{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  for(int i=0;i<s.length();i++)
   if(s.charAt(i)!='0')
    System.out.print(s.charAt(i));
 }
}