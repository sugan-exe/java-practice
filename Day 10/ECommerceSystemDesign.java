import java.util.ArrayList;
import java.util.List;

public class ECommerceSystemDesign {
    public static void main(String[] args) {
        System.out.println("=== E-Commerce System Design (Abstraction, Encapsulation, Interfaces) ===");
        
        ShoppingCart cart = new ShoppingCart("USER-101");
        cart.addItem(new PhysicalProduct("PROD-01", "Gaming Monitor", 299.99, 5.5));
        cart.addItem(new DigitalProduct("PROD-02", "IntelliJ IDEA Ultimate License", 149.00, "https://download.jetbrains.com/key"));

        cart.displayCart();

        PaymentProcessor processor = new PayPalProcessor("buyer@tech.org");
        if (processor.verifyAccount()) {
            processor.executePayment(cart.getTotalAmount());
        }
    }
}

// Interface
interface PaymentProcessor {
    boolean verifyAccount();
    void executePayment(double amount);
}

// Encapsulated Class implementing Interface
class PayPalProcessor implements PaymentProcessor {
    private String email;

    public PayPalProcessor(String email) { this.email = email; }

    @Override
    public boolean verifyAccount() {
        System.out.println("[PayPal] Verifying buyer account: " + email);
        return true;
    }

    @Override
    public void executePayment(double amount) {
        System.out.printf("[PayPal] Successfully processed $%.2f via PayPal balance.%n", amount);
    }
}

// Abstract Class
abstract class EProduct {
    private String sku; // Encapsulated private fields
    private String name;
    private double price;

    public EProduct(String sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public String getSku() { return sku; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract void deliver(); // Abstract method
}

class PhysicalProduct extends EProduct {
    private double weightKg;

    public PhysicalProduct(String sku, String name, double price, double weightKg) {
        super(sku, name, price);
        this.weightKg = weightKg;
    }

    @Override
    public void deliver() {
        System.out.printf("[Shipping] Dispatching physical package '%s' (Weight: %.1f kg) via FedEx.%n", getName(), weightKg);
    }
}

class DigitalProduct extends EProduct {
    private String downloadUrl;

    public DigitalProduct(String sku, String name, double price, String downloadUrl) {
        super(sku, name, price);
        this.downloadUrl = downloadUrl;
    }

    @Override
    public void deliver() {
        System.out.printf("[Instant Access] Sending license download link for '%s': %s%n", getName(), downloadUrl);
    }
}

// Encapsulated Shopping Cart
class ShoppingCart {
    private String userId;
    private List<EProduct> items;

    public ShoppingCart(String userId) {
        this.userId = userId;
        this.items = new ArrayList<>();
    }

    public void addItem(EProduct product) {
        items.add(product);
        System.out.println("[Cart] Added item: " + product.getName());
    }

    public double getTotalAmount() {
        double total = 0;
        for (EProduct p : items) total += p.getPrice();
        return total;
    }

    public void displayCart() {
        System.out.println("\n--- Shopping Cart for User: " + userId + " ---");
        for (EProduct p : items) {
            System.out.printf(" * [%s] %-28s : $%.2f%n", p.getSku(), p.getName(), p.getPrice());
            p.deliver();
        }
        System.out.printf("Total Cart Value: $%.2f%n%n", getTotalAmount());
    }
}
