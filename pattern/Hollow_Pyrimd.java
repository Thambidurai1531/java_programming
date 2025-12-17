import java.util.Scanner;
public class Hollow_Pyrimd{
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.printf(" ");
            }
            for(int j=1;j<=2*i-1;j++){
              if(j==1||j==2*i-1||i==n)
              System.out.printf("*");
              else
              System.out.printf(" ");
            }
            System.out.println();
            }
        }
    }
