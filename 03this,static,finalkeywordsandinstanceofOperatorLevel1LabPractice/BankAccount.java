
class BankAccount {
    private static String bankName = "National Bank";
    private String accountHolderName;
    private static int totalAccounts = 0;
    private final int accountNumber;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name " + bankName);
            System.out.println("Account Holder" + accountHolderName);
            System.out.println("Account Number" + accountNumber);
        } else {
            System.out.println("Invalid account");
        }
    }

    public static void main(String[] args) {
        BankAccount account2 = new BankAccount("Bob", 102);
        BankAccount account1 = new BankAccount("Alice", 101);

        account1.displayAccountDetails();
        account2.displayAccountDetails();

        System.out.println("\nTotal Bank Accounts Created " + BankAccount.getTotalAccounts());
    }
}

