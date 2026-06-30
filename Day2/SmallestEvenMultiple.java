import java.util.Scanner;

public class SmallestEvenMultiple {

    public static int smallestEvenMultiple(int n) {

        if (n % 2 == 0)
            return n;

        return n * 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Smallest Even Multiple = " + smallestEvenMultiple(n));

        sc.close();
    }
}