import java.util.Scanner;
class Odd_even_mix{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int e=0,o=0;
  while(n>0){
   if((n%10)%2==0) e++;
   else o++;
   n/=10;
  }
  if(e>0 && o>0) System.out.println("Mixed");
  else if(e>0) System.out.println("All Even");
  else System.out.println("All Odd");
 }
}