import java.util.Scanner;

public class SignOfProduct {

    public static int arraySign(int[] nums) {

        int sign = 1;

        for (int num : nums) {

            if (num == 0)
                return 0;

            if (num < 0)
                sign *= -1;
        }

        return sign;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Sign = " + arraySign(nums));

        sc.close();
    }
}