import java.util.Scanner;

public class MinimumCuts {

    public static int numberOfCuts(int n) {

        if (n == 1)
            return 0;

        if (n % 2 == 0)
            return n / 2;

        return n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of slices: ");
        int n = sc.nextInt();

        System.out.println("Minimum Cuts = " + numberOfCuts(n));

        sc.close();
    }
}