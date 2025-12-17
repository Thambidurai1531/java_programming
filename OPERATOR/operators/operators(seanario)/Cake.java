import java.util.Scanner;
public class Cake{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.printf("enter total cake :: ");
	    int cake = sc.nextInt();
	    System.out.printf("enter total hour : ");
	    int hour = sc.nextInt();
	    System.out.println("total cake produced : "+cake*hour);
	}
}