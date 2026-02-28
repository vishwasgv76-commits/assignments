package module3;
class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, 5000);
        b.deposit(2000);
        b.withdraw(3000);
        b.display();
    }
}

