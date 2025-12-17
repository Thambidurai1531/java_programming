import java.util.Scanner;
public class  Multiply_without_star
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int r=0;
	    for(int i=0;i<b;i++){
	        r=r+a;
	    }
	    System.out.println(r);
	}
}
