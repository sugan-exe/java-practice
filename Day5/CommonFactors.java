import java.util.Scanner;

public class CommonFactors {

    public static int commonFactors(int a, int b) {

        int min = Math.min(a, b);
        int count = 0;

        for (int i = 1; i <= min; i++) {

            if (a % i == 0 && b % i == 0)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Common Factors = " + commonFactors(a, b));

        sc.close();
    }
}