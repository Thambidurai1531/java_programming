import java.util.Scanner;
public class UppercaseAlphabets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
   sc.close(); }
}
