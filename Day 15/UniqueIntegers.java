import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
        System.out.println("Values without repetition: " + uniqueNumbers);
    }
}
