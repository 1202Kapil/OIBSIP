import java.util.Scanner;

public class ATMinterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize account balance to $1,000
        double balance = 1000.0;

        // ATM interface
        while (true) {
            System.out.println("Welcome to the ATM. Please select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Your current balance is $" + balance);
                    break;
                case 2:
                    System.out.println("Please enter the amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Error: Insufficient funds");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Your new balance is $" + balance);
                    }
                    break;
                case 3:
                    System.out.println("Please enter the amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. Your new balance is $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Error: Invalid option");
                    break;
            }
        }
    }
}
