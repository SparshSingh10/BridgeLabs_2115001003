class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number --> " + accountNumber);
        System.out.println("Balance --> " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type are --> Savings Account");
        System.out.println("Interest Rate are --> " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type are --> Checking Account");
        System.out.println("Withdrawal Limit are --> " + withdrawalLimit + " INR");
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type are --> Fixed Deposit Account");
        System.out.println("Maturity Period are --> " + maturityPeriod + " months");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 50000, 5.0);
        CheckingAccount checking = new CheckingAccount("CA67890", 20000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount("FDA98765", 100000, 12);

        System.out.println("--- Savings Account ---");
        savings.displayAccountInfo();
        savings.displayAccountType();

        System.out.println("\n--- Checking Account ---");
        checking.displayAccountInfo();
        checking.displayAccountType();

        System.out.println("\n--- Fixed Deposit Account ---");
        fd.displayAccountInfo();
        fd.displayAccountType();
    }
}
