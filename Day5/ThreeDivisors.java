import java.util.Scanner;

public class ThreeDivisors {

    public static boolean isThree(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0)
                count++;

            if (count > 3)
                return false;
        }

        return count == 3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(isThree(n));

        sc.close();
    }
}