import java.util.ArrayList;
import java.util.List;

public class EvenNumbersList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(5);
        numbers.add(8);
        numbers.add(21);
        numbers.add(14);
        numbers.add(33);
        numbers.add(40);
        
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        
        System.out.println(evenNumbers);
    }
}
