import java.util.Scanner;
public class MiniATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double balance = 5000;   // Initial balance
        double amount;
        System.out.println("----- MINI ATM -----");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your Balance: ₹" + balance);
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                amount = sc.nextDouble();
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposited Successfully!");
                    System.out.println("Updated Balance: ₹" + balance);
                } else {
                    System.out.println("Invalid amount!");
                }
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ");
                amount = sc.nextDouble();
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Please collect your cash.");
                    System.out.println("Remaining Balance: ₹" + balance);
                } else {
                    System.out.println("Insufficient balance or invalid amount!");
                }
                break;
            case 4:
                System.out.println("Thank you for using the ATM.");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
