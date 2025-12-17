import java.util.Scanner;
public class ATM{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.printf("enter amount : ");
	    int a = sc.nextInt();
	    int b = a/2000;
	    int c = (a%2000)/500;
	    int d = ((a % 2000) % 500) / 100;
	    System.out.println("2000 : "+b);
	    System.out.println("500 : "+c);
	    System.out.println("100 : "+d);
	}
}
