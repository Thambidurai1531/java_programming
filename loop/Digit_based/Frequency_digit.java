import java.util.Scanner;
public class Frequency_digit{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  for(char d='0';d<='9';d++){
   int c=0;
   for(int i=0;i<s.length();i++)
    if(s.charAt(i)==d) c++;
   if(c>0) System.out.println(d+" = "+c);
  }
 }
}