import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int last=0;
	    int temp=n;
	    int sq=0;
	    while(n!=0){
	         last=n%10;
	        sq=sq+(last*last*last);
	        n=n/10;
	    }
	    if(temp==sq)
	    System.out.println("arm");
	    else
	    System.out.println("not");
	}
}
