// User-defined custom exception (checked exception)
class InsufficientFundsException extends Exception {
    private double deficit;

    public InsufficientFundsException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". Current Balance: $" + balance);
    }

    // Declaring that this method can throw InsufficientFundsException using 'throws'
    public void withdraw(double amount) throws InsufficientFundsException {
        System.out.println("Attempting to withdraw $" + amount + "...");
        if (amount > balance) {
            double deficit = amount - balance;
            // Throwing custom exception using 'throw'
            throw new InsufficientFundsException("Withdrawal failed due to insufficient funds!", deficit);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining Balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        System.out.println("=== Example 2: Custom Exception & throw/throws ===");
        
        BankAccount account = new BankAccount("ACC-1001", 500.00);
        account.deposit(200.00); // Balance becomes 700.00
        
        try {
            account.withdraw(400.00); // Successful withdrawal
            account.withdraw(600.00); // This will trigger InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
            System.out.println("Short by: $" + e.getDeficit());
        }
    }
}
