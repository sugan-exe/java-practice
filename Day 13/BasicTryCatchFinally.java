public class BasicTryCatchFinally {
    public static void divideNumbers(int a, int b) {
        try {
            System.out.println("Attempting division: " + a + " / " + b);
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero!");
        } finally {
            System.out.println("Finally block executed: Division operation completed.\n");
        }
    }

    public static void accessArrayElement(int[] arr, int index) {
        try {
            System.out.println("Accessing element at index " + index + "...");
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index " + index + " is out of bounds!");
        } catch (Exception e) {
            System.out.println("Caught general Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed: Array access check finished.\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Example 1: Basic Try-Catch-Finally ===");
        
        // Test normal division and division by zero
        divideNumbers(10, 2);
        divideNumbers(10, 0);
        
        // Test array out of bounds
        int[] numbers = {10, 20, 30};
        accessArrayElement(numbers, 1);
        accessArrayElement(numbers, 5);
    }
}
