import java.util.Scanner;
public class oddoreven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter x =");
        int x = sc.nextInt();
        
        if(x%2==0)
        System.out.printf("x is even");
        else
        System.out.printf("x is odd");
    }
}