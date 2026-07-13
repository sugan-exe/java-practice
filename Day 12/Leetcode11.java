
public class Leetcode11 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, width * currentHeight);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] height2 = { 1, 1 };

        System.out.println("=== LeetCode 11: Container With Most Water ===");
        System.out.println("Test Case 1 -> Max Area: " + maxArea(height1)); // Expected: 49
        System.out.println("Test Case 2 -> Max Area: " + maxArea(height2)); // Expected: 1
    }
}
