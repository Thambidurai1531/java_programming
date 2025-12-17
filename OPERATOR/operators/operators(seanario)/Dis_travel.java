import java.util.Scanner;
public class Dis_travel{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your speed = ");
        int speed = sc.nextInt();
        System.out.printf("Enter your speed in hour = ", args);
        int time = sc.nextInt();
        System.out.println("distace = "+(speed*time));
    }
}


