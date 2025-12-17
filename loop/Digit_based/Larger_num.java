import java.util.Scanner;
class larger_num{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), max=0;
  while(n>0){
   int d=n%10;
   if(d>max) 
   max=d;
   n/=10;
  }
  System.out.println(max);
 }
}