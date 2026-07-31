class Account {
    private double balance = 1000;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(500);
        account.withdraw(300);

        System.out.println("Current Balance: " + account.getBalance());
    }
}
