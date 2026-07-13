public class ApplianceAbstraction {
    public static void main(String[] args) {
        System.out.println("=== Appliance Abstraction Demo ===");
        Appliance[] homeAppliances = {
            new WashingMachine("LG Smart Washer", 8.0),
            new Refrigerator("Samsung Twin Cooling", -18),
            new AirConditioner("Daikin Inverter", 22)
        };

        for (Appliance app : homeAppliances) {
            app.plugIn();
            app.turnOn(); // Abstract method call
            app.turnOff();
            System.out.println("----------------------------------------");
        }
    }
}

abstract class Appliance {
    protected String brandModel;

    public Appliance(String brandModel) {
        this.brandModel = brandModel;
    }

    public void plugIn() {
        System.out.println("[Power] " + brandModel + " plugged into AC wall socket.");
    }

    public void turnOff() {
        System.out.println("[Power] " + brandModel + " powered down safely.");
    }

    public abstract void turnOn();
}

class WashingMachine extends Appliance {
    private double drumCapacityKg;

    public WashingMachine(String brandModel, double drumCapacityKg) {
        super(brandModel);
        this.drumCapacityKg = drumCapacityKg;
    }

    @Override
    public void turnOn() {
        System.out.printf("[Washing Machine] %s starting laundry cycle (Drum: %.1f kg capacity).%n", brandModel, drumCapacityKg);
    }
}

class Refrigerator extends Appliance {
    private int targetTempCelsius;

    public Refrigerator(String brandModel, int targetTempCelsius) {
        super(brandModel);
        this.targetTempCelsius = targetTempCelsius;
    }

    @Override
    public void turnOn() {
        System.out.printf("[Refrigerator] %s compressor activated. Regulating freezer temp to %d°C.%n", brandModel, targetTempCelsius);
    }
}

class AirConditioner extends Appliance {
    private int setpointCelsius;

    public AirConditioner(String brandModel, int setpointCelsius) {
        super(brandModel);
        this.setpointCelsius = setpointCelsius;
    }

    @Override
    public void turnOn() {
        System.out.printf("[AC] %s cooling started. Room temperature setpoint: %d°C.%n", brandModel, setpointCelsius);
    }
}
