public class ChefAndVowels {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int countPairs(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (!isVowel(s.charAt(i)) && isVowel(s.charAt(i + 1))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] testCases = {"codechef", "chef", "takeitexy"};
        for (String s : testCases) {
            System.out.println(countPairs(s));
        }
    }
}
