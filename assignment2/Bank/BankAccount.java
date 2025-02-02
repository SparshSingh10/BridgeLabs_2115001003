
public class BankAccount {
    public int accountNumber; // Public: Accessible anywhere
    protected String accountHolder; // Protected: Accessible within the same package and subclasses
    private double balance; // Private: Accessible only within this class

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate; // Additional feature for savings account

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + super.accountNumber); // Accessing public field
        System.out.println("Account Holder: " + super.accountHolder); // Accessing protected field
        System.out.println("Balance: $" + getBalance()); // Accessing private field via getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(1001, "JRahul", 5000.0, 3.5);

        sa.displayAccountDetails();

        sa.deposit(1000);
        sa.withdraw(2000);

        System.out.println("Updated Balance: $" + sa.getBalance());
    }
}
