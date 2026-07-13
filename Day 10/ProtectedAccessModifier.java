class ProtectedVehicle {
    protected String brand;
    protected int speed;

    ProtectedVehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    protected void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

class ProtectedCar extends ProtectedVehicle {
    String model;

    ProtectedCar(String brand, int speed, String model) {
        super(brand, speed);
        this.model = model;
    }

    void showDetails() {
        System.out.println("Car: " + brand + " " + model);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class ProtectedBike extends ProtectedVehicle {
    ProtectedBike(String brand, int speed) {
        super(brand, speed);
    }

    void showDetails() {
        System.out.println("Bike: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class ProtectedAccessModifier {
    public static void main(String[] args) {
        ProtectedCar c = new ProtectedCar("Toyota", 180, "Fortuner");
        c.showDetails();

        System.out.println();

        ProtectedBike b = new ProtectedBike("Royal Enfield", 120);
        b.showDetails();

        System.out.println();

        c.display();
        b.display();
    }
}
