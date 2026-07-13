public class RideSharingSystem {
    public static void main(String[] args) {
        System.out.println("=== Ride-Sharing System (Abstraction & Encapsulation) ===");
        
        RideService[] rides = {
            new StandardRide("RIDE-101", 12.5),
            new LuxuryRide("RIDE-102", 12.5)
        };

        for (RideService ride : rides) {
            ride.bookRide();
            System.out.printf("Estimated Fare for %.1f miles: $%.2f%n", ride.getDistanceMiles(), ride.calculateFare());
            ride.completeRide();
            System.out.println("----------------------------------------");
        }
    }
}

// Abstract Class (Abstraction)
abstract class RideService {
    private String rideId; // Encapsulated private field
    private double distanceMiles;

    public RideService(String rideId, double distanceMiles) {
        this.rideId = rideId;
        this.distanceMiles = distanceMiles;
    }

    public String getRideId() { return rideId; }
    public double getDistanceMiles() { return distanceMiles; }

    public void bookRide() {
        System.out.println("[Ride Booking] Confirmed ride reference: " + rideId);
    }

    public void completeRide() {
        System.out.println("[Ride Status] Ride " + rideId + " completed. Driver rated 5 stars!");
    }

    // Abstract method for polymorphic fare calculation
    public abstract double calculateFare();
}

class StandardRide extends RideService {
    private static final double BASE_FARE = 3.00;
    private static final double RATE_PER_MILE = 1.50;

    public StandardRide(String rideId, double distanceMiles) {
        super(rideId, distanceMiles);
    }

    @Override
    public double calculateFare() {
        System.out.println("[Standard Ride] Applying standard pricing rates.");
        return BASE_FARE + (getDistanceMiles() * RATE_PER_MILE);
    }
}

class LuxuryRide extends RideService {
    private static final double BASE_FARE = 10.00;
    private static final double RATE_PER_MILE = 3.50;
    private static final double LUXURY_SURCHARGE = 15.00;

    public LuxuryRide(String rideId, double distanceMiles) {
        super(rideId, distanceMiles);
    }

    @Override
    public double calculateFare() {
        System.out.println("[Luxury Ride] Applying premium black-car rates & chauffeur surcharge.");
        return BASE_FARE + (getDistanceMiles() * RATE_PER_MILE) + LUXURY_SURCHARGE;
    }
}
