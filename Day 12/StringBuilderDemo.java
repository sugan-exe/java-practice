public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.capacity());
        sb.append(" World");
        System.out.println(sb);
        sb.append(0.45f);
        System.out.println(sb);

        sb.insert(5, ",");
        System.out.println(sb);

        sb.replace(0, 5, "Hi");
        System.out.println(sb);

        sb.delete(2, 3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
