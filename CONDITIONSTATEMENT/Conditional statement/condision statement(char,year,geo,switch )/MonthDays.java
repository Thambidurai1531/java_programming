import java.util.Scanner;
public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month : ");
        int month = sc.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        System.out.println("This mouth has 31 Days");
        else if(month==2){
            if((year%4==0||year%400==0)&&year%100!=0)
            System.out.println("This month has 29 Days");
            else
            System.out.println("This month has 28 Days");
            }
        else if(month==4||month==6||month==9||month==11)
        System.out.println("this month has 30 Days");
        else
        System.out.println("invalid input");
    }
}
