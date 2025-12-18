import java.util.Scanner;
public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Vowels: ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                System.out.print(ch + " ");
        }

        System.out.print("\nConsonants: ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
                System.out.print(ch + " ");
        }
   sc.close(); }
}

