public class VowelOrConsonant {
    public static String checkChar(char ch) {
        char lower = Character.toLowerCase(ch);
        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
            return "Vowel";
        }
        return "Consonant";
    }

    public static void main(String[] args) {
        char[] testCases = {'Z', 'E', 'b', 'u'};
        for (char ch : testCases) {
            System.out.println(checkChar(ch));
        }
    }
}
