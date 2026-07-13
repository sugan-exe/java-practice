import java.util.ArrayList;
import java.util.List;

public class StringListToUpper {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("hi");
        programmingLanguages.add("i am varun");
        programmingLanguages.replaceAll(String::toUpperCase);
        for (String language : programmingLanguages) {
            System.out.println(language);
        }
    }
}
