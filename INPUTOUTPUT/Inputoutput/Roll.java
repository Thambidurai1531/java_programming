import java.util.Scanner;
public class Roll{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Roll No: "+roll+","+"Name: "+name);
    }}