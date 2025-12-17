import java.util.Scanner;
public class Min_sec{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the min : ");
        int min = sc.nextInt();
        System.out.println("Minutes to seconds : "+min*60);
    }
}


