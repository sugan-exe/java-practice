import java.util.Scanner;

public class FindDuplicateNumber {

    public static int findDuplicate(int[] nums) {

        boolean[] visited = new boolean[nums.length];

        for (int num : nums) {
            if (visited[num])
                return num;
            visited[num] = true;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.println("Duplicate Number = " + findDuplicate(nums));

        sc.close();
    }
}