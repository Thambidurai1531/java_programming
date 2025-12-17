import java.util.Scanner;
public class Neon_number
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sq=n*n;
	    int sum=0;
	    while(sq!=0){
	        int last=sq%10;
	        sum=sum+last;
	        sq=sq/10;
	    }
	    if(n==sum)
	    System.out.println("neon number");
	    else
	    System.out.println("not neon number");
	}
}
