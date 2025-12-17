import java.util.Scanner;
public class Strong_number
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int temp=n;
	   int sum=0;
	   while(n!=0){
	       int last=n%10;
	       int fact=1;

	       for(int i=1;i<=last;i++){
	           fact=fact*i;
	       }
	       sum=sum+fact;
	       n=n/10;
	   }
	   if(temp==sum){
	       System.out.println("strong");
	   }else
	   System.out.println("not strong");
	}
}
