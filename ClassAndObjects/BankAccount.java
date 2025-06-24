public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    public BankAccount(String holder, String number, double initialBalance) {
        accountHolder = holder;
        accountNumber = number;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Sneha", "ACC123456", 1000);
        account.displayBalance();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(2000); // Test insufficient balance
        account.displayBalance();
    }
}
