import java.util.Scanner;
public class AsciiAtoZ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " = " + (int)ch);
        }
    sc.close();}
}
