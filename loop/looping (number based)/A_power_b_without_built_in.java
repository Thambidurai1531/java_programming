import java.util.Scanner;
public class  A_power_b_without_built_in
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int r=1;
	    for(int i=1;i<=b;i++){
	        r=r*a;
	    }
	    System.out.println(r);
	}
}
