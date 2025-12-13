import java.util.Scanner;
public class Smaller{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x<y)
        System.out.printf("x is Smaller");
        else
        System.out.printf("y is Smaller");
    }
}