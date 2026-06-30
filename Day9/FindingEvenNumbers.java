import java.util.Arrays;
import java.util.Scanner;

public class FindingEvenNumbers {

    public static int[] findEvenNumbers(int[] digits) {

        boolean[] used = new boolean[1000];

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {

                    if (i == j || j == k || i == k)
                        continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];

                    if (digits[i] != 0 && num % 2 == 0)
                        used[num] = true;
                }
            }
        }

        int count = 0;
        for (boolean b : used)
            if (b)
                count++;

        int[] result = new int[count];

        int index = 0;

        for (int i = 100; i < 1000; i++) {
            if (used[i])
                result[index++] = i;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        System.out.println("Enter digits:");

        for (int i = 0; i < n; i++)
            digits[i] = sc.nextInt();

        System.out.println(Arrays.toString(findEvenNumbers(digits)));

        sc.close();
    }
}