import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.print("Enter the element to search for: ");
        char element = scanner.next().charAt(0);

        int index = text.toLowerCase().indexOf(Character.toLowerCase(element));

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the string.");
        }

        scanner.close();
    }
}
