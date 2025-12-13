import java.util.Scanner;
public class Samelast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%100==b%100)
            System.out.println("same last digit");
        else
        System.out.println("Different last digit");
    }
}
