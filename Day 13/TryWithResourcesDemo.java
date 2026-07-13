import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

// Custom AutoCloseable resource to demonstrate automatic cleanup
class CustomResource implements AutoCloseable {
    private String name;

    public CustomResource(String name) {
        this.name = name;
        System.out.println("Resource [" + name + "] opened.");
    }

    public void doWork(boolean shouldThrow) throws Exception {
        System.out.println("Resource [" + name + "] is performing work...");
        if (shouldThrow) {
            throw new Exception("Error occurred during work in [" + name + "]!");
        }
    }

    @Override
    public void close() {
        System.out.println("Resource [" + name + "] closed automatically.");
    }
}

public class TryWithResourcesDemo {
    public static void demonstrateBufferedReader() {
        String data = "Line 1: Hello Java\nLine 2: Try-with-resources is awesome!\nLine 3: End of stream.";
        
        // BufferedReader and StringReader implement AutoCloseable, closed automatically when block exits
        try (BufferedReader reader = new BufferedReader(new StringReader(data))) {
            System.out.println("--- Reading Data Stream ---");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    public static void demonstrateCustomAutoCloseable() {
        System.out.println("\n--- Testing Custom AutoCloseable Resource ---");
        try (CustomResource res1 = new CustomResource("DatabaseConnection");
             CustomResource res2 = new CustomResource("FileStream")) {
            
            res1.doWork(false);
            res2.doWork(true); // This throws an exception
            
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Example 3: Try-With-Resources & AutoCloseable ===");
        demonstrateBufferedReader();
        demonstrateCustomAutoCloseable();
    }
}
