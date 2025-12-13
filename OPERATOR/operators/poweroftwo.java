import java.util.Scanner;
public class poweroftwo {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.err.println(((n&(n-1))==0)?"power of two":"Not power of two");
}
}
