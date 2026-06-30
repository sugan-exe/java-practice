import java.util.Scanner;

public class DivisorGame {

    public static boolean divisorGame(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (divisorGame(n))
            System.out.println("Alice Wins");
        else
            System.out.println("Alice Loses");

        sc.close();
    }
}