import java.util.Scanner;
public class ASCIIvalue {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char Str = sc.next().charAt(0);
        System.out.print((int)Str);
        sc.close();
}
} 
