import java.util.Scanner;
public class Year_dig_equ{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter your year : ");
    int year = sc.nextInt();
    int a = year/100;
    int b = year%100;
    if(a==b){
        System.out.println("first two and last two digit are equal");
    }
    else
    System.out.println("first two and last two digit are not equal");
    }
}