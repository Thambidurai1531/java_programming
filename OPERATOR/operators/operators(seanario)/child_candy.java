import java.util.Scanner;
public class child_candy{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.printf("enter total child ");
	    int child = sc.nextInt();
	    System.out.printf("enter total candy ");
	    int candy = sc.nextInt();
	    System.out.println("Each get : "+(candy/child));
	    System.out.println("remaining : "+(candy%child));
	}
}