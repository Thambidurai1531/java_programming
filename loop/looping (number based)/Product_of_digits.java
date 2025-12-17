import java.util.Scanner;
public class Product_of_digits{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pro=1;
        while(n!=0){
            int dig=n%10;
            pro=pro*dig;
            n=n/10;
        }
        System.out.println(pro);
    }
}