import java.util.Scanner;
public class Triangle_valid{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter three angles of Trianlge");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if((a+b+c)==180)
    System.out.println("Valid Triangle");
    else
        System.out.println("Not a Valid Triangle");
    }
}