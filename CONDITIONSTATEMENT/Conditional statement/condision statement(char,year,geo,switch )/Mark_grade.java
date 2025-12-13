import java.util.Scanner;
public class Mark_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if (mark > 80) {
            System.out.println("A");
        } else if (mark > 60) {
            System.out.println("B");
        } else if (mark > 40) {
            System.out.println("Java");
        } else if (mark >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid input");
        }
    }
}
