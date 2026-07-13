public class ShapeAbstractClassDemo {
    public static void main(String[] args) {
        System.out.println("=== Shape Abstract Class Demo (Computing Area for Circle & Rectangle) ===");
        
        AbstractShape[] shapes = {
            new CircleShape("Red", 7.5),
            new RectangleShape("Blue", 12.0, 8.5)
        };

        for (AbstractShape shape : shapes) {
            shape.displayColor();
            System.out.printf("Computed Area: %.2f%n", shape.computeArea());
            System.out.println("----------------------------------------");
        }
    }
}

abstract class AbstractShape {
    protected String color;

    public AbstractShape(String color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Shape Color: " + color);
    }

    // Abstract method: sub-classes MUST implement area computation
    public abstract double computeArea();
}

class CircleShape extends AbstractShape {
    private double radius;

    public CircleShape(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        System.out.println("[Circle] Calculating area for radius = " + radius);
        return Math.PI * radius * radius;
    }
}

class RectangleShape extends AbstractShape {
    private double length;
    private double width;

    public RectangleShape(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double computeArea() {
        System.out.println("[Rectangle] Calculating area for length = " + length + ", width = " + width);
        return length * width;
    }
}
