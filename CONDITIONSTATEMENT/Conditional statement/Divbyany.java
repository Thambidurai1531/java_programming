import java.util.Scanner;
public class Divbyany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0||a%7==0)
        System.out.println("Yes it is divided by either 3 and 7");
        else
        System.out.println("No it is divided by either 3 and 7");
    }
}
