public class SmartDeviceMultipleInterfaces {
    public static void main(String[] args) {
        System.out.println("=== Multiple Interfaces Demo: Smartphone implementing Phone, Camera, GPS ===");
        Smartphone phone = new Smartphone("Galaxy S24 Ultra");

        // Calling methods from different interface capabilities
        phone.makeCall("+1-555-0199");
        phone.receiveCall("Mom");
        phone.takePhoto();
        phone.recordVideo();
        phone.navigate("Central Park, NY");
        phone.showCoordinates();
    }
}

interface Phone {
    void makeCall(String number);
    void receiveCall(String caller);
}

interface Camera {
    void takePhoto();
    void recordVideo();
}

interface GPS {
    void navigate(String destination);
    void showCoordinates();
}

class Smartphone implements Phone, Camera, GPS {
    private String modelName;

    public Smartphone(String modelName) {
        this.modelName = modelName;
    }

    // Phone interface implementations
    @Override
    public void makeCall(String number) {
        System.out.println("[Phone] " + modelName + " dialing number: " + number);
    }

    @Override
    public void receiveCall(String caller) {
        System.out.println("[Phone] " + modelName + " receiving call from: " + caller);
    }

    // Camera interface implementations
    @Override
    public void takePhoto() {
        System.out.println("[Camera] " + modelName + " captured 200MP HDR photo! Click!");
    }

    @Override
    public void recordVideo() {
        System.out.println("[Camera] " + modelName + " recording 8K 60FPS video...");
    }

    // GPS interface implementations
    @Override
    public void navigate(String destination) {
        System.out.println("[GPS] " + modelName + " calculating fastest route to: " + destination);
    }

    @Override
    public void showCoordinates() {
        System.out.println("[GPS] Current location: 40.7128° N, 74.0060° W");
    }
}
