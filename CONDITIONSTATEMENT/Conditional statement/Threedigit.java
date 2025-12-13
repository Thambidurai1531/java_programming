import java.util.Scanner;
public class Threedigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=100&&a<=999)
            System.out.println("The give number is 3 Digit");
        else
        System.out.println("Not a 3 Digit number");
    }
}