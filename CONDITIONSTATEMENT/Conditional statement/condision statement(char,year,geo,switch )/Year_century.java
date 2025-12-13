import java.util.Scanner;
public class Year_century{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter your year : ");
    int year = sc.nextInt();
    if(year%100==0){
        System.out.println("century year");
    }
    else
    System.out.println("Not a century year");
    }
}