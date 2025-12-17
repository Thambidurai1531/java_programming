import java.util.Scanner;
class Ascending_order{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int prev=9, ok=1;
  while(n>0){
   int d=n%10;
   if(d>prev) ok=0;
   prev=d;
   n/=10;
  }
  System.out.println(ok==1?"Yes":"No");
 }
}