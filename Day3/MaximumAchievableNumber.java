import java.util.Scanner;

public class MaximumAchievableNumber {

    public static int theMaximumAchievableX(int num, int t) {
        return num + (2 * t);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        System.out.print("Enter t: ");
        int t = sc.nextInt();

        System.out.println("Maximum Achievable Number = " +
                theMaximumAchievableX(num, t));

        sc.close();
    }
}