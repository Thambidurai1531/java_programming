import java.util.Scanner;
public class Sum_of_all_factors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            // System.out.println(i);
         sum+=i;
        }System.out.println(sum);
    }
}
