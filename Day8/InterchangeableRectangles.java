import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InterchangeableRectangles {

    public static long interchangeableRectangles(int[][] rectangles) {

        Map<Double, Long> map = new HashMap<>();
        long pairs = 0;

        for (int[] rect : rectangles) {

            double ratio = (double) rect[0] / rect[1];

            pairs += map.getOrDefault(ratio, 0L);

            map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
        }

        return pairs;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rectangles: ");
        int n = sc.nextInt();

        int[][] rectangles = new int[n][2];

        System.out.println("Enter width and height:");

        for (int i = 0; i < n; i++) {
            rectangles[i][0] = sc.nextInt();
            rectangles[i][1] = sc.nextInt();
        }

        System.out.println("Pairs = " + interchangeableRectangles(rectangles));

        sc.close();
    }
}