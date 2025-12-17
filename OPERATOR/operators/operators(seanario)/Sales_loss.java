import java.util.Scanner;
public class Sales_loss{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.printf("enter sales price : ");
	    int sp = sc.nextInt();
	    System.out.printf("enter total loss : ");
	    int l = sc.nextInt();
	    System.out.println("total cost price : "+(sp+l));
	}
}
