import java.util.Scanner;
public class Productaddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a*b)%2==0)
        System.out.println("Product of two number is Even");
        else
        System.out.println("Product of two number is Odd");
    }
}
