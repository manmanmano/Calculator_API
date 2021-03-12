package ee.taltech.calculator.service;

import java.util.List;
import java.util.stream.Collectors;

public class AverageOfEvenService {
    public static Double averageOfEven(List<Integer> numbers) {
        if (numbers == null) {
            return null;
        }
        if (numbers.isEmpty()) {
            return Double.valueOf(0);
        }
        List<Integer> evens = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
        Integer sum = evens.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return (double) sum / evens.size();
    }
}
