public class PaymentGatewayInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== Payment Gateway Interface Demo (UPI, Card, NetBanking) ===");
        
        PaymentGateway[] gateways = {
            new UpiGateway("user@okicici"),
            new CardGateway("4111-2222-3333-4444", "123"),
            new NetBankingGateway("HDFC Bank", "CUST-8899")
        };

        double invoiceAmount = 1499.99;

        for (PaymentGateway pg : gateways) {
            if (pg.authenticate()) {
                pg.pay(invoiceAmount);
            } else {
                System.out.println("[Payment Failed] Authentication unsuccessful.");
            }
            pg.generateTransactionId();
            System.out.println("----------------------------------------");
        }
    }
}

interface PaymentGateway {
    boolean authenticate();
    void pay(double amount);
    
    // Default method (Java 8+)
    default void generateTransactionId() {
        long txnId = (long) (Math.random() * 100000000000L);
        System.out.println("[Gateway] Generated TXN Ref ID: TXN-" + txnId);
    }
}

class UpiGateway implements PaymentGateway {
    private String vpa;

    public UpiGateway(String vpa) { this.vpa = vpa; }

    @Override
    public boolean authenticate() {
        System.out.println("[UPI Auth] Verifying Virtual Payment Address: " + vpa);
        return true;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("[UPI Transfer] $%.2f debited directly via UPI VPA %s.%n", amount, vpa);
    }
}

class CardGateway implements PaymentGateway {
    private String cardNumber;
    private String cvv;

    public CardGateway(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean authenticate() {
        System.out.println("[Card Auth] Validating Card Number ending in " + cardNumber.substring(cardNumber.length() - 4) + " and CVV...");
        return true;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("[Card Charge] $%.2f charged to Credit Card.%n", amount);
    }
}

class NetBankingGateway implements PaymentGateway {
    private String bankName;
    private String customerId;

    public NetBankingGateway(String bankName, String customerId) {
        this.bankName = bankName;
        this.customerId = customerId;
    }

    @Override
    public boolean authenticate() {
        System.out.println("[NetBanking Auth] Redirecting to " + bankName + " portal for Customer ID: " + customerId);
        return true;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("[NetBanking] $%.2f transferred via NEFT/IMPS from %s.%n", amount, bankName);
    }
}
