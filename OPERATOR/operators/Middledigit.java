import java.util.Scanner;

public class Middledigit {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b=a/10;
    int c=b%10;
    System.err.println(c);
    }
}
