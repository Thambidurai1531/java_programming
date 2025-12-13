import java.util.Scanner;
public class Lastoddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a%100;
        if(b%2==0)
            System.out.println("Last digit is even");
        else
        System.out.println("Last digit is Odd");
    }
}
