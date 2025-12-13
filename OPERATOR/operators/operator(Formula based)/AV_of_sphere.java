import java.util.Scanner;
public class AV_of_sphere{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double a=4*3.14*r*r;
        double v=(4.0/3.0)*3.14*r*r*r;
        System.out.println(a);
        System.out.println(v);
    }
}