import java.util.Scanner;

public class CountOddNumbers {

    public static int countOdds(int low, int high) {

        return (high + 1) / 2 - low / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter low: ");
        int low = sc.nextInt();

        System.out.print("Enter high: ");
        int high = sc.nextInt();

        System.out.println("Odd Count = " + countOdds(low, high));

        sc.close();
    }
}