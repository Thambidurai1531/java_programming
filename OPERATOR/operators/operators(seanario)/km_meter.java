import java.util.Scanner;
public class km_meter{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your distance in km = ");
        int km = sc.nextInt();
        System.out.println("km to meter = "+km*1000);
    }
}


