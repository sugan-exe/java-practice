public class BankingApplicationEncapsulation {
    public static void main(String[] args) {
        System.out.println("=== Secure Banking Application (Encapsulation & Validation) ===");
        SecureBankAccount account = new SecureBankAccount("SB-1009", "Sarah Jenkins", 5000.00, "1234");

        System.out.println("\n--- Attempting operations with wrong PIN ---");
        account.deposit(1000.00, "0000");
        account.withdraw(500.00, "9999");
        account.checkBalance("1111");

        System.out.println("\n--- Performing valid operations with correct PIN ---");
        account.checkBalance("1234");
        account.deposit(1500.00, "1234");
        account.withdraw(2000.00, "1234");
        account.withdraw(10000.00, "1234"); // Overdraft attempt
        account.checkBalance("1234");
    }
}

class SecureBankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String pin; // Sensitive private field

    public SecureBankAccount(String accountNumber, String accountHolder, double initialDeposit, String pin) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        this.pin = pin;
        System.out.println("[Bank] Secure account opened for " + accountHolder + " (" + accountNumber + ")");
    }

    private boolean validatePin(String inputPin) {
        if (this.pin.equals(inputPin)) {
            return true;
        } else {
            System.out.println("[Security Alert] Invalid PIN entered! Operation denied.");
            return false;
        }
    }

    public void deposit(double amount, String inputPin) {
        if (!validatePin(inputPin)) return;
        
        if (amount > 0) {
            balance += amount;
            System.out.printf("[Deposit] Successfully deposited $%.2f. New Balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("[Error] Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount, String inputPin) {
        if (!validatePin(inputPin)) return;

        if (amount <= 0) {
            System.out.println("[Error] Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.printf("[Error] Insufficient balance! Available Balance: $%.2f, Requested: $%.2f%n", balance, amount);
        } else {
            balance -= amount;
            System.out.printf("[Withdrawal] Successfully withdrew $%.2f. Remaining Balance: $%.2f%n", amount, balance);
        }
    }

    public void checkBalance(String inputPin) {
        if (!validatePin(inputPin)) return;
        System.out.printf("[Balance Enquiry] Account [%s - %s] Current Balance: $%.2f%n", accountNumber, accountHolder, balance);
    }
}
