import java.util.Scanner;
public class LCM
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int temp;
	    while(b!=0){
	              temp=b;
	        b=a%b;
	        a=temp;
	    }
	   int  gcd=a;
	    System.out.println(gcd);
	}
}