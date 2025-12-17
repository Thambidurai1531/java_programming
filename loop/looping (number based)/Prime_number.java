import java.util.Scanner;
public class Prime_number{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                 sum++;
            }
        }if(sum>2){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
}