import java.util.Scanner;
public class Cal_cel_to_fah{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        double f=(c*9/5)+32;
        System.out.println(f);
    }
}