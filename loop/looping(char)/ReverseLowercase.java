import java.util.Scanner;
public class ReverseLowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (char ch = 'z'; ch >= 'a'; ch--) {
            System.out.print(ch + " ");
        }
   sc.close(); }
}
