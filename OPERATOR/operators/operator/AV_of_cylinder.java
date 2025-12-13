import java.util.Scanner;
public class AV_of_cylinder{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int h=sc.nextInt();
        double a=2*3.14*r*(r+h);
        double v=3.14*r*r*h;
        System.out.println(a);
        System.out.println(v);
    }
}