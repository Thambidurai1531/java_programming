import java.util.Scanner;
public class LCM
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int temp;
	    int x=a;
	    int y=b;
	    while(b!=0){
	              temp=b;
	        b=a%b;
	        a=temp;
	    }
	   int  gcd=a;
	   int lcm=(x*y)/gcd;
	    System.out.println(lcm);
	}
}