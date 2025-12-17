import java.util.Scanner;
class Sum_sq_cu{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int sq=0, cu=0;
  while(n>0){
   int d=n%10;
   sq+=d*d;
   cu+=d*d*d;
   n/=10;
  }
  System.out.println(sq);
  System.out.println(cu);
 }
}