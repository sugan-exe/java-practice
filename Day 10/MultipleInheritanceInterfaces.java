public class MultipleInheritanceInterfaces {
    public static void main(String[] args) {
        System.out.println("=== Multiple Inheritance Using Flyable & Swimmable Interfaces ===");
        
        Duck duck = new Duck("Donald");
        duck.fly();
        duck.swim();
        duck.displaySpecies();

        System.out.println();
        Seaplane seaplane = new Seaplane("Canadair CL-415");
        seaplane.fly();
        seaplane.swim();
    }
}

interface Flyable {
    int MAX_ALTITUDE = 10000; // public static final by default
    void fly(); // public abstract by default
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    private String name;

    public Duck(String name) { this.name = name; }

    @Override
    public void fly() {
        System.out.println("[Flyable] Duck " + name + " is flapping its wings and flying over the pond!");
    }

    @Override
    public void swim() {
        System.out.println("[Swimmable] Duck " + name + " is paddling gracefully in the water.");
    }

    public void displaySpecies() {
        System.out.println("Species: Waterfowl | Max Altitude: " + MAX_ALTITUDE + " ft");
    }
}

class Seaplane implements Flyable, Swimmable {
    private String model;

    public Seaplane(String model) { this.model = model; }

    @Override
    public void fly() {
        System.out.println("[Flyable] Seaplane " + model + " airborne at high cruising speed.");
    }

    @Override
    public void swim() {
        System.out.println("[Swimmable] Seaplane " + model + " floating and navigating on the harbor water surface.");
    }
}
