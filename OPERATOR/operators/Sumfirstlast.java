import java.util.Scanner;

public class Sumfirstlast {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = a%10;
    int c = a/100;
    System.err.println(b+c);
    }
}
