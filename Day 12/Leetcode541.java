
public class Leetcode541 {
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        int k1 = 2;
        String s2 = "abcd";
        int k2 = 2;

        System.out.println("=== LeetCode 541: Reverse String II ===");
        System.out.println("s = \"" + s1 + "\", k = " + k1 + " -> \"" + reverseStr(s1, k1) + "\""); // Expected:
                                                                                                    // "bacdfeg"
        System.out.println("s = \"" + s2 + "\", k = " + k2 + " -> \"" + reverseStr(s2, k2) + "\""); // Expected: "bacd"
    }
}
