import java.util.Scanner;

public class DelayedArrivalTime {

    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter arrival time: ");
        int arrivalTime = sc.nextInt();

        System.out.print("Enter delayed time: ");
        int delayedTime = sc.nextInt();

        System.out.println("New Arrival Time = " +
                findDelayedArrivalTime(arrivalTime, delayedTime));

        sc.close();
    }
}