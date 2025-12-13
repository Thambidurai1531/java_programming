import java.util.Scanner;
public class AV_of_Cuboid{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int a=2*(l*b+b*h+h*l);
        int v=l*b*h;
        System.out.println(a);
        System.out.println(v);
    }
}