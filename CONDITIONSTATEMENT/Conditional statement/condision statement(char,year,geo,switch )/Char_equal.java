import java.util.Scanner;
public class Char_equal{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch1 = sc.next().toLowerCase().charAt(0);
    char ch2 = sc.next().toLowerCase().charAt(0);
    if(ch1==ch2)
        System.out.println("Both are equal");
    else
        System.out.println("Both are not equal");
    }
}