import java.util.Scanner;
class Small_num{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), low=n;
  while(n>0){
   int d=n%10;
   if(d<low) 
   low=d;
   n/=10;
  }
  System.out.println(low);
 }
}