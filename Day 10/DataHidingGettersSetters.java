public class DataHidingGettersSetters {
    public static void main(String[] args) {
        System.out.println("=== Data Hiding & Encapsulation Demo (Private Fields + Getters/Setters) ===");
        
        UserProfile profile = new UserProfile("USR-01", "John Doe", 25);
        profile.display();

        System.out.println("\nAttempting invalid age update (-5):");
        profile.setAge(-5); // Validation blocks this
        profile.display();

        System.out.println("\nAttempting valid age update (26):");
        profile.setAge(26);
        System.out.println("Updated Age via getter: " + profile.getAge());
    }
}

class UserProfile {
    // Private fields hidden from external classes
    private String userId;
    private String username;
    private int age;

    public UserProfile(String userId, String username, int age) {
        this.userId = userId;
        this.username = username;
        setAge(age); // use setter to ensure initial validation
    }

    // Getter methods
    public String getUserId() { return userId; }
    public String getUsername() { return username; }
    public int getAge() { return age; }

    // Setter methods with validation logic
    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        } else {
            System.out.println("[Validation Error] Username cannot be empty.");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("[Validation Error] Age must be between 0 and 150!");
        }
    }

    public void display() {
        System.out.printf("User ID: %s | Username: %s | Age: %d%n", userId, username, age);
    }
}
