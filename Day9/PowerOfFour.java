import java.util.Scanner;

public class PowerOfFour {

    public static boolean isPowerOfFour(int n) {

        if (n <= 0)
            return false;

        while (n % 4 == 0)
            n /= 4;

        return n == 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(isPowerOfFour(n));

        sc.close();
    }
}