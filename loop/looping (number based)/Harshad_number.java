import java.util.Scanner;
public class Harshad_number
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum=0;
	    int temp=n;
	    while(n!=0){
	        int last=n%10;
	        sum=sum+last;
	        n=n/10;
	    }
	    if(temp/sum==0)
	    System.out.println("harshad number");
	    else
	    System.out.println("not harshad number");
	}
}
