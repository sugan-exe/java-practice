import java.util.ArrayList;
import java.util.List;

public class Leetcode68 {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int j = i + 1;
            int lineLength = words[i].length();
            while (j < words.length && lineLength + 1 + words[j].length() <= maxWidth) {
                lineLength += 1 + words[j].length();
                j++;
            }

            StringBuilder sb = new StringBuilder();
            int numWords = j - i;
            int numGaps = numWords - 1;

            if (j == words.length || numWords == 1) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } else {
                int totalSpaces = maxWidth - lineLength + numGaps;
                int spacesPerGap = totalSpaces / numGaps;
                int extraSpaces = totalSpaces % numGaps;

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        for (int s = 0; s <= spacesPerGap + (k - i < extraSpaces ? 1 : 0) - 1; s++) {
                            sb.append(" ");
                        }
                    }
                }
            }
            result.add(sb.toString());
            i = j;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> justified = fullJustify(words, maxWidth);
        for (String line : justified) {
            System.out.println("\"" + line + "\"");
        }
    }
}
