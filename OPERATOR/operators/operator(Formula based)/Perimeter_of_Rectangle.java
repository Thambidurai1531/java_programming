import java.util.Scanner;
public class Perimeter_of_Rectangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int rec=2*(l+b);
        System.out.println(rec);
    }
}