import java.util.Scanner;

public class TotalDistanceTraveled {

    public static int distanceTraveled(int mainTank, int additionalTank) {

        int distance = 0;

        while (mainTank > 0) {

            mainTank--;
            distance += 10;

            if (distance % 50 == 0 && additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }

        return distance;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main tank: ");
        int mainTank = sc.nextInt();

        System.out.print("Enter additional tank: ");
        int additionalTank = sc.nextInt();

        System.out.println("Total Distance = " +
                distanceTraveled(mainTank, additionalTank) + " km");

        sc.close();
    }
}