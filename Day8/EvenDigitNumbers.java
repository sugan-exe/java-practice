import java.util.Scanner;

public class EvenDigitNumbers {

    public static int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {

            int digits = String.valueOf(Math.abs(num)).length();

            if (digits % 2 == 0)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.println("Count = " + findNumbers(nums));

        sc.close();
    }
}