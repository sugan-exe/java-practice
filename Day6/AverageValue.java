import java.util.Scanner;

public class AverageValue {

    public static int averageValue(int[] nums) {

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            if (num % 6 == 0) {
                sum += num;
                count++;
            }
        }

        if (count == 0)
            return 0;

        return sum / count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Average = " + averageValue(nums));

        sc.close();
    }
}