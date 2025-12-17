import java.util.Scanner;
public class Bytes_bits{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your distance in byte = ");
        int bytes = sc.nextInt();
        System.out.println("bytes to bits = "+ bytes*8);
    }
}


