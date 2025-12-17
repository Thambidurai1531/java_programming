import java.util.Scanner;
public class Mango{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tot  = sc.nextInt();
        int price = sc.nextInt();
        int free = tot/4;
        int payfor = tot - free;
        System.out.println(payfor*price); 
    }
}