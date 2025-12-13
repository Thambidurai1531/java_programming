import java.util.Scanner;
public class Triangle_right{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter three angles of Triange");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a==90||b==90||c==90)
        System.out.println("Right angle Triange");
    else
    
        System.out.println("Not a Right angle Triange");
    
    }
}