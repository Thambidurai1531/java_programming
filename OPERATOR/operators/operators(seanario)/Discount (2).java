import java.util.Scanner;
public class Discount{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int rate = sc.nextInt();
        int discount = rate/10;
        System.out.println("totol amount = "+rate);
        System.out.println("Discount amount = "+discount);
        System.out.println("final amount = "+(rate-discount));
    }
}


