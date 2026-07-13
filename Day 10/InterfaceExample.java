interface SimplePrintable {
    void print();
}

interface SimpleShowable {
    void show();
}

class SimpleDocument implements SimplePrintable, SimpleShowable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void show() {
        System.out.println("Showing document...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        SimpleDocument d = new SimpleDocument();
        d.print();
        d.show();
    }
}
