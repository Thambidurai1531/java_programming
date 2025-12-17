import java.util.Scanner;
public class Pen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pen = sc.nextInt();
        int price = sc.nextInt();
        int grp = pen/5;
        int free = grp*2;
        int paypen = (pen - free);
        int actpay = paypen*price;
        System.out.println(paypen);
        System.out.println(actpay);
    }
}