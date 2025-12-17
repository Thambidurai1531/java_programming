import java.util.Scanner;
public class Buzz_number
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int last=n%10;
	    if(last==7||n%7==0)
	    System.out.println("buzz number");
	    else
	    System.out.println("not buzz number");
	}
}
