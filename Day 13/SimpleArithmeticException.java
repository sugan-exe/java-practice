public class SimpleArithmeticException {
    public static void main(String[] args) {
        System.out.println("=== Simple ArithmeticException Example ===");
        
        int numerator = 50;
        int denominator = 0;
        
        try {
            System.out.println("Attempting to divide " + numerator + " by " + denominator + "...");
            int result = numerator / denominator; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught! You cannot divide a number by zero.");
            System.out.println("Technical Error Message: " + e.getMessage());
        }
        
        System.out.println("\nProgram execution continues normally after handling the exception.");
    }
}
