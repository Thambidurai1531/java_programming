import java.util.Scanner;
public class Hollow_Square_both_diagonals{
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==n||i==n||j==1||i==j||i+j==n+1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}