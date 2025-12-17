import java.util.Scanner;
class Occurence_no{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), d=sc.nextInt();
  int f=0;
  while(n>0){
   if(n%10==d) f=1;
   n/=10;
  }
  System.out.println(f==1?"Yes":"No");
 }
}