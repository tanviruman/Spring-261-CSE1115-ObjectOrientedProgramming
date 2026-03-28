class BankAccount {
    String holderName;
    String accountId;
    double balance;

    BankAccount(String holderName, String accountId, double balance) {
        this.holderName = holderName;
        this.accountId = accountId;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", "ACC001", 1000.0);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000); // will show insufficient funds
    }
}