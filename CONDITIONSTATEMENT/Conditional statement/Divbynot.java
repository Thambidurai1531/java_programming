import java.util.Scanner;
public class Divbynot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0&&a%2==0&a%8!=0)
        System.out.println("Yes it is divided by both 3 and 7 and not divided by 8");
        else
        System.out.println("No it is divided by both 3 and 7");
    }
}
