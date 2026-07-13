public class InstanceofKeyword {
    public static void main(String[] args) {
        String text = "Hello";
        Integer num = 10;
        Object obj = new String("Test");

        System.out.println("text instanceof String: " + (text instanceof String));
        System.out.println("num instanceof Integer: " + (num instanceof Integer));
        System.out.println("num instanceof Number: " + (num instanceof Number));
        System.out.println("obj instanceof String: " + (obj instanceof String));
        System.out.println("text instanceof Object: " + (text instanceof Object));
    }
}
