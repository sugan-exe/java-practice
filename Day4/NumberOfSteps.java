import java.util.Scanner;

public class NumberOfSteps {

    public static int numberOfSteps(int num) {

        int steps = 0;

        while (num != 0) {

            if (num % 2 == 0)
                num /= 2;
            else
                num--;

            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Steps = " + numberOfSteps(num));

        sc.close();
    }
}