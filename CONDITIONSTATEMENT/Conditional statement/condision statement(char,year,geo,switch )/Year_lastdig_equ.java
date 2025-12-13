import java.util.Scanner;
public class Year_lastdig_equ{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter your year1 : ");
    int year1 = sc.nextInt();
    System.out.printf("Enter your year2 : ");
    int year2 = sc.nextInt();
    int a = year1%100;
    int b = year2%100;
    if(a==b){
        System.out.println(" last two digit are equal");
    }
    else
    System.out.println(" last two digit are not equal");
    }
}