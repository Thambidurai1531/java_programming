import java.util.Scanner;
public class Magic_number
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum=0;
	    while(n!=0){
	        int last=n%10;
	        sum=sum+last;
	        n=n/10;
	}
	int add=0;
	while(sum!=0){
	    int l=sum%10;
	    add=add+l;
	    sum=sum/10;
	}
	if(add==1)
	System.out.println("Magic number");
	else
	System.out.println("not magic number");
}
}
