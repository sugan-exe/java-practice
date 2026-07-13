
public class Leetcode796 {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;
        return doubled.contains(goal);
    }

    public static void main(String[] args) {
        String s1 = "abcde", goal1 = "cdeab";
        String s2 = "abcde", goal2 = "abced";

        System.out.println("=== LeetCode 796: Rotate String ===");
        System.out.println("s = \"" + s1 + "\", goal = \"" + goal1 + "\" -> " + rotateString(s1, goal1)); // Expected:
                                                                                                          // true
        System.out.println("s = \"" + s2 + "\", goal = \"" + goal2 + "\" -> " + rotateString(s2, goal2)); // Expected:
                                                                                                          // false
    }
}
