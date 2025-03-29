public class Account {
    // instance variables (non-static field)
    private String name;
    private double balance;

    // class variables (static fields)
    private static int totalAccounts = 0;

    // constructor with parameters
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        totalAccounts++;
    }

    // method: deposit
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("depozit efectuat cu succes.");
    }

    //method: withdraw
    public void withdraw(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            System.out.println("retragere efectuata cu succes.");
        } else {
            System.out.println("fonduri insuficiente.");
        }
    }

    public void displayInfo() {
        System.out.println("nume: " + this.name);
        System.out.println("balanta: " + this.balance);
        System.out.println("nr. de conturi: " + totalAccounts);
    }

    public static void main(String[] args) {
        Account account1 = new Account("Mario", 5000);
        Account account2 = new Account("Luigi", 3500);

        account1.deposit(1500);
        account1.displayInfo();

    }
}
