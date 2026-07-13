public class FinalKeyword {

    final int MAX_SPEED = 120;
    final String BRAND;

    FinalKeyword(String brand) {
        this.BRAND = brand;
    }

    final void display() {
        System.out.println("Brand: " + BRAND);
        System.out.println("Max Speed: " + MAX_SPEED);
    }

    public static void main(String[] args) {
        FinalKeyword car = new FinalKeyword("Toyota");
        car.display();

        // car.MAX_SPEED = 200;  --> This will give error because MAX_SPEED is final
    }
}
