import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();

        int decimal = 0;
        int power = 0;

        for (int i = bin.length() - 1; i >= 0; i--) {
            int digit = bin.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }

        System.out.println(decimal);
    sc.close();}
}
