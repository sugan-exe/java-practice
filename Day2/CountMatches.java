import java.util.Scanner;

public class CountMatches {

    public static int numberOfMatches(int n) {

        int matches = 0;

        while (n > 1) {

            if (n % 2 == 0) {
                matches += n / 2;
                n /= 2;
            } else {
                matches += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }

        return matches;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teams: ");
        int n = sc.nextInt();

        System.out.println("Total Matches = " + numberOfMatches(n));

        sc.close();
    }
}