class CustomerAccount {
    protected String accNum;
    protected double balance;

    public CustomerAccount(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public void showAccDetails() {
        System.out.println("Account No =-> " + accNum + " | Balance =-> ₹" + balance);
    }
}

class SavingAccount extends CustomerAccount {
    private double intRate;

    public SavingAccount(String accNum, double balance, double intRate) {
        super(accNum, balance);
        this.intRate = intRate;
    }

    public void showAccountType() {
        System.out.println("Account Type =-> Saving Account");
        super.showAccDetails();
        System.out.println("Interest rate =-> " + intRate + "%");
    }
}

class CurrentAccount extends CustomerAccount {
    private double limit;

    public CurrentAccount(String accNum, double balance, double limit) {
        super(accNum, balance);
        this.limit = limit;
    }

    public void showAccountType() {
        System.out.println("Account Type =-> Current Account");
        super.showAccDetails();
        System.out.println("Withdraw Limit =-> ₹" + limit);
    }
}

class FixedDepositAccount extends CustomerAccount {
    private int termInMonths;

    public FixedDepositAccount(String accNum, double balance, int termInMonths) {
        super(accNum, balance);
        this.termInMonths = termInMonths;
    }

    public void showAccountType() {
        System.out.println("Account Type =-> Fixed Deposit Account");
        super.showAccDetails();
        System.out.println("Deposit Term =-> " + termInMonths + " months");
    }
}

public class MainApp {
    public static void main(String[] args) {
        SavingAccount saving = new SavingAccount("S1234", 4500, 4.5);
        CurrentAccount current = new CurrentAccount("C6789", 3200, 1500);
        FixedDepositAccount fixed = new FixedDepositAccount("FD9999", 15000, 24);

        System.out.println("--- Saving Account are -->");
        saving.showAccountType();

        System.out.println("\n--- Current Account are -->");
        current.showAccountType();

        System.out.println("\n--- Fixed Deposit Account are -->");
        fixed.showAccountType();
    }
}
