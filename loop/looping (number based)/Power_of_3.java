import java.util.Scanner;
public class Power_of_3
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int s=0;
	    while(n%3==0){
	         n=n/3;
	        
	    }
	    if(n==1)
	    System.out.println("power of 3");
	    else
	    System.out.println("not a pow of 3");
	}
}
