import java.util.Scanner;
public class Interest{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.printf("enter total price : ");
	    int p = sc.nextInt();
	    System.out.printf("enter total time : ");
	    int t = sc.nextInt();
	    System.out.printf("enter total interest : ");
	    int i = sc.nextInt();
	    System.out.println("SI : "+((p*t*i)/100));
	}
}