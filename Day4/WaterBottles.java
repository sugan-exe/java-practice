import java.util.Scanner;

public class WaterBottles {

    public static int numWaterBottles(int numBottles, int numExchange) {

        int total = numBottles;

        while (numBottles >= numExchange) {

            int newBottles = numBottles / numExchange;

            total += newBottles;

            numBottles = newBottles + (numBottles % numExchange);
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bottles: ");
        int bottles = sc.nextInt();

        System.out.print("Enter exchange rate: ");
        int exchange = sc.nextInt();

        System.out.println("Maximum bottles you can drink = " +
                numWaterBottles(bottles, exchange));

        sc.close();
    }
}