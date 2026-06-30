import java.util.Scanner;

public class DigitGame {

    public static boolean canAliceWin(int[] nums) {

        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int num : nums) {

            if (num < 10)
                singleDigitSum += num;
            else
                doubleDigitSum += num;
        }

        return singleDigitSum != doubleDigitSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.println(canAliceWin(nums));

        sc.close();
    }
}