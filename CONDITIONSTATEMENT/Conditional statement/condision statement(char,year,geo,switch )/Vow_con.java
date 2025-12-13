import java.util.Scanner;
public class Vow_con{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().toLowerCase().charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        System.out.println("given character "+ch+" is vowels");
    else
        System.out.println("given character "+ch+" is consonant");
    }
}