import java.util.Scanner;
public class Asciiaddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        if (ascii % 2 == 0) {
            System.out.println("ASCII value of the character is Even");
        } else {
            System.out.println("ASCII value of the character  is Odd.");
        }

        sc.close();
    }
}

