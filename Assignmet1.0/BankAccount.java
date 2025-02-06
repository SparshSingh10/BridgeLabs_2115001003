import java.util.ArrayList;

class Account {
    private String AccNumber;
    private double balance;

    public Account(String accNumber) {
        AccNumber = accNumber;
        this.balance = 0.0;
    }

    public String getAccNumber() {
        return AccNumber;
    }

    public void setAccNumber(String accNumber) {
        AccNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double money) {
        if (money > 0)
            balance += money;
        else
            System.out.println("Enter greater than 0");
    }

    public void withdraw(double money) {
        if (balance >= money) {
            balance -= money;
        } else
            System.out.println("Less balance");
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account ac) {
        accounts.add(ac);
    }

    public void viewBalance() {
        System.out.println("Account balance for " + name + " is:");
        for (Account ac : accounts)
            System.out.println("Account Number: " + ac.getAccNumber() + " balance is " + ac.getBalance());
    }
}

class Bank {
    private String bankName;
    private ArrayList<Customer> cus;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.cus = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
        cus.add(customer);
        System.out.println(
                "Account opened for " + customer.getName() + " with Account Number: " + account.getAccNumber());
    }
}

public class BankAccount {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("sbi Bank");

        Customer customer1 = new Customer("rahul");
        Customer customer2 = new Customer("aman");

        Account account1 = new Account("12345");
        Account account2 = new Account("67890");

        bank.openAccount(customer1, account1);
        bank.openAccount(customer2, account2);

        account1.deposit(1000.0);
        account2.deposit(500.0);

        account1.withdraw(200.0);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}
