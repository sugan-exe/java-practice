public class CountVowelsArray {
    public static int countVowels(String s) {
        int count = 0;
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("programming"));
    }
}
