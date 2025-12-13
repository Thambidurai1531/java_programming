import java.util.Scanner;
public class Alp_not{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().toLowerCase().charAt(0);
    if(ch>='a'&&ch<='z')
        System.out.println("given character "+ch+" is alphabet");
    else
        System.out.println("given character "+ch+" is not a alphabet");
    }
}