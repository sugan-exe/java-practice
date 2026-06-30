import java.util.Scanner;

public class DistributeCandies {

    public static int[] distributeCandies(int candies, int numPeople) {

        int[] result = new int[numPeople];

        int give = 1;
        int index = 0;

        while (candies > 0) {

            result[index] += Math.min(give, candies);

            candies -= give;

            give++;

            index = (index + 1) % numPeople;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter candies: ");
        int candies = sc.nextInt();

        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        int[] ans = distributeCandies(candies, people);

        System.out.println("Distribution:");

        for (int x : ans)
            System.out.print(x + " ");

        sc.close();
    }
}