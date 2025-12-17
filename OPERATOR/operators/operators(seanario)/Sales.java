import java.util.Scanner;
public class Sales{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.printf("enter cost price : ");
	    int cp = sc.nextInt();
	    System.out.printf("enter total profit : ");
	    int p = sc.nextInt();
	    System.out.println("total sales price : "+(cp+p));
	}
}
