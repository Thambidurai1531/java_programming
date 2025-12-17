import java.util.Scanner;
class Occurence_count{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), d=sc.nextInt(), c=0;
  while(n>0){
   if(n%10==d) c++;
   n/=10;
  }
  System.out.println(c);
 }
}