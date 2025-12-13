import java.util.Scanner;
public class Divby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0&&a%5==0)
        System.out.println("Yes it is divided by both 3 and 5");
        else
        System.out.println("No it is divided by both 3 and 5");
    }
}
