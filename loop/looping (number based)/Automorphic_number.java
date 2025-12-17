import java.util.Scanner;
public class Automorphic_number
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sq=n*n;
	    int m=n%10;
	    if(sq%10==m)
	    System.out.println("automorphic number");
	    else
	    System.out.println("nor automorphic number");
	}
}
