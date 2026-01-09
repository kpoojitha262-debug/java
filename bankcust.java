import java.util.Scanner;

class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw money
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a new account
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        String accNumber = sc.nextLine();

        BankAccount account = new BankAccount(name, accNumber, 0); // start with 0 balance

        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            while(!sc.hasNextInt()) {  // Handle invalid input
                System.out.println("Please enter a valid number!");
                sc.next(); 
            }
            choice = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            switch(choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    while(!sc.hasNextDouble()) {
                        System.out.println("Please enter a valid amount!");
                        sc.next();
                    }
                    double deposit = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    account.deposit(deposit);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    while(!sc.hasNextDouble()) {
                        System.out.println("Please enter a valid amount!");
                        sc.next();
                    }
                    double withdraw = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    account.withdraw(withdraw);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our bank!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while(choice != 4);

        sc.close();
    }
}
