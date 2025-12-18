import java.util.Scanner;

public class CountBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();

        int ones = 0, zeros = 0;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1')
                ones++;
            else if (bin.charAt(i) == '0')
                zeros++;
        }

        System.out.println("1s = " + ones);
        System.out.println("0s = " + zeros);
   sc.close(); }
}
