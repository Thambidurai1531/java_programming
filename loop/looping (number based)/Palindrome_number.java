import java.util.Scanner;
public class Palindrome_number{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(n!=0){
            int sum=n%10;
            rev=rev*10+sum;
            n=n/10;
        }
        if(temp==rev)
        System.out.println("palindrome number");
        else
        System.out.println("not palindrome number");
    }
}