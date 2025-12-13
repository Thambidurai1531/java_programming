import java.util.Scanner;
public class Num_not{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().toLowerCase().charAt(0);
    if(ch>='0'&&ch<='9')
        System.out.println("given character "+ch+" is Number");
    else
        System.out.println("given character "+ch+" is not a Number");
    }
}