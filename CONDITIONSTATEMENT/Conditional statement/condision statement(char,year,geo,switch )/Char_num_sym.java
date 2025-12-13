import java.util.Scanner;
public class Char_num_sym{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(ch>='a'&&ch<='z')
        System.out.println("char is LowerCase");
    else if(ch>='A'&&ch<='Z')
        System.out.println("char is UpperCase");
    else if(ch>='0'&&ch<='9')
        System.out.println("char is Number");
    else
        System.out.println("char is symbol");
    }
}