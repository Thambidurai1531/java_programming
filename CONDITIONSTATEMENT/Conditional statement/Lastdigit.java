import java.util.Scanner;
public class Lastdigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int temp=i%10;
        if(temp==3||temp==6||temp==9)
        System.out.println(i+"  last digit is divided by 3");
        else
        System.out.println(i+" last digit is not divided by 3");
    }
}