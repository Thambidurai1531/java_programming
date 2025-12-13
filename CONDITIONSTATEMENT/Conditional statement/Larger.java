import java.util.Scanner;
public class Larger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>y)
        System.out.printf("x is larger");
        else
        System.out.printf("y is larger");
    }
}