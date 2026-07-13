class PrivateAccount {
    private String accountHolder;
    private double balance;
    private int pin;

    PrivateAccount(String accountHolder, double balance, int pin) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pin = pin;
    }

    private boolean verifyPin(int inputPin) {
        return this.pin == inputPin;
    }

    void deposit(double amount, int inputPin) {
        if (verifyPin(inputPin)) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Wrong PIN!");
        }
    }

    void checkBalance(int inputPin) {
        if (verifyPin(inputPin)) {
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Wrong PIN!");
        }
    }
}

public class PrivateAccessModifier {
    public static void main(String[] args) {
        PrivateAccount acc = new PrivateAccount("Varun", 5000, 1234);

        acc.deposit(2000, 1234);
        acc.checkBalance(1234);

        System.out.println();

        acc.deposit(1000, 9999);
        acc.checkBalance(9999);
    }
}
