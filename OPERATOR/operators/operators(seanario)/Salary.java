import java.util.Scanner;
public class Salary{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.printf("enter total Basic : ");
	    int b = sc.nextInt();
	    System.out.printf("enter total HRA : ");
	    int h = sc.nextInt();
	    System.out.printf("enter total Allowance : ");
	    int a = sc.nextInt();
	    System.out.println("total salary : "+(a+h+b));
	}
}