public class VehicleHierarchyAbstraction {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Hierarchy Using Abstract Class & Methods ===");
        
        AbstractVehicle[] garage = {
            new ElectricCar("Tesla Model S", 100),
            new DieselTruck("Volvo FH", 18)
        };

        for (AbstractVehicle v : garage) {
            v.start();
            v.fuelUp(); // Abstract method call resolved at runtime
            v.stop();
            System.out.println("----------------------------------------");
        }
    }
}

abstract class AbstractVehicle {
    protected String model;

    public AbstractVehicle(String model) {
        this.model = model;
    }

    // Concrete methods shared by all subclasses
    public void start() { System.out.println("[Vehicle] " + model + " ignition started."); }
    public void stop() { System.out.println("[Vehicle] " + model + " engine switched off."); }

    // Abstract method must be implemented by concrete subclasses
    public abstract void fuelUp();
}

class ElectricCar extends AbstractVehicle {
    private int batteryCapacityKwh;

    public ElectricCar(String model, int batteryCapacityKwh) {
        super(model);
        this.batteryCapacityKwh = batteryCapacityKwh;
    }

    @Override
    public void fuelUp() {
        System.out.println("[Electric Fuel] Plugging into Supercharger for " + model + " (" + batteryCapacityKwh + " kWh battery).");
    }
}

class DieselTruck extends AbstractVehicle {
    private int wheels;

    public DieselTruck(String model, int wheels) {
        super(model);
        this.wheels = wheels;
    }

    @Override
    public void fuelUp() {
        System.out.println("[Diesel Fuel] Pumping heavy-duty diesel into tank for " + model + " (" + wheels + "-wheeler).");
    }
}
