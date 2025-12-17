import java.util.Scanner;
class First_odd_even{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  while(n>=10) n/=10;
  System.out.println(n%2==0?"Even":"Odd");
 }
}