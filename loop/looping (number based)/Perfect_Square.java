import java.util.Scanner;
public class Perfect_Square{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sq=(int)Math.sqrt(n);
	    System.out.println(sq);
	    if(sq*sq==n)
	    System.out.println("perfect Square");
	    else
	    System.out.println("Not perfect Square");
	}
}