import java.util.Scanner;
public class Mark {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.err.println((a>35)?"Pass":"Fail");
    }
}
