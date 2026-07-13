public class StaticKeyword {
    static int count = 0;
    String name;

    StaticKeyword(String name) {
        this.name = name;
        count++;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    static void showCount() {
        System.out.println("Total objects created: " + count);
    }

    public static void main(String[] args) {
        StaticKeyword s1 = new StaticKeyword("Varun");
        StaticKeyword s2 = new StaticKeyword("Rahul");
        StaticKeyword s3 = new StaticKeyword("Amit");

        s1.display();
        s2.display();
        s3.display();

        StaticKeyword.showCount();
    }
}
