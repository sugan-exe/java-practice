class EncapsulatedAccount {
    private String owner;
    private double balance;

    void setOwner(String o) {
        owner = o;
    }

    String getOwner() {
        return owner;
    }

    void setBalance(double b) {
        if (b >= 0) {
            balance = b;
        }
    }

    double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        EncapsulatedAccount acc = new EncapsulatedAccount();
        acc.setOwner("Rahul");
        acc.setBalance(25000);
        System.out.println("Owner: " + acc.getOwner());
        System.out.println("Balance: " + acc.getBalance());
    }
}
