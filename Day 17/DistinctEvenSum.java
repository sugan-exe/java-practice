import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DistinctEvenSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(10);
        list.add(8);
        list.add(3);
        
        System.out.println("Original list: " + list);
        
        Set<Integer> distinctEvens = new LinkedHashSet<>();
        for (int num : list) {
            if (num % 2 == 0) {
                distinctEvens.add(num);
            }
        }
        
        System.out.println("Distinct even elements: " + distinctEvens);
        
        int sum = 0;
        for (int num : distinctEvens) {
            sum += num;
        }
        
        System.out.println("Sum of distinct even elements: " + sum);
    }
}
