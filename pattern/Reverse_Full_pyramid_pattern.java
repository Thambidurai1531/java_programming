import java.util.Scanner;
public class Inverse_Full_pyramid_pattern
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            if(i<=j)
	            System.out.printf("* ");
	            else
	            System.out.printf(" ");
	        }
	        System.out.println();
	    }
	}
}