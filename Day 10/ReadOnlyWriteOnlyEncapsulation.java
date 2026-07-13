public class ReadOnlyWriteOnlyEncapsulation {
    public static void main(String[] args) {
        System.out.println("=== Read-Only & Write-Only Properties Using Encapsulation ===");
        
        System.out.println("1. Read-Only Property (Account Number & Creation Date):");
        ReadOnlyAccount acc = new ReadOnlyAccount("RO-998811", "2026-07-01");
        System.out.println("Account Number (Read-Only): " + acc.getAccountNumber());
        System.out.println("Creation Date (Read-Only): " + acc.getCreationDate());
        // Note: acc.setAccountNumber(...) does not exist! It cannot be modified.

        System.out.println("\n2. Write-Only Property (Security Password & PIN):");
        WriteOnlyCredentials creds = new WriteOnlyCredentials();
        creds.setPassword("SuperSecretPass123!");
        creds.setPin(4321);
        // Note: creds.getPassword() does not exist! External classes cannot read back secret passwords.
        creds.authenticate("SuperSecretPass123!", 4321);
        creds.authenticate("WrongPass", 4321);
    }
}

class ReadOnlyAccount {
    // Private fields assigned once during object initialization
    private String accountNumber;
    private String creationDate;

    public ReadOnlyAccount(String accountNumber, String creationDate) {
        this.accountNumber = accountNumber;
        this.creationDate = creationDate;
    }

    // Only Getters provided -> Read-Only
    public String getAccountNumber() { return accountNumber; }
    public String getCreationDate() { return creationDate; }
}

class WriteOnlyCredentials {
    private String password;
    private int pin;

    // Only Setters provided -> Write-Only
    public void setPassword(String password) {
        this.password = password;
        System.out.println("[Security] Password updated successfully in secure memory.");
    }

    public void setPin(int pin) {
        this.pin = pin;
        System.out.println("[Security] PIN updated successfully in secure memory.");
    }

    // Internal validation method (not a getter)
    public void authenticate(String inputPassword, int inputPin) {
        if (this.password != null && this.password.equals(inputPassword) && this.pin == inputPin) {
            System.out.println("[Auth] Authentication Successful! Access Granted.");
        } else {
            System.out.println("[Auth] Authentication Failed! Invalid credentials.");
        }
    }
}
