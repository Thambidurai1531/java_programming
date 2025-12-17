import java.util.Scanner;
public class Swap_first_last{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int last=n%10, first=n;
  while(first>=10) first/=10;
  
  int b = n/10;int a = b%10;
  System.out.println(last+""+a+""+first);
 }
}