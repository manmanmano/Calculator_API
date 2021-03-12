package ee.taltech.calculator.service;

import java.util.List;
import java.util.stream.Collectors;

public class AverageOfEvenService {
    public static List<Integer> findNegatives(List<Integer> numbers) {
        if (numbers == null) {
            return null;
        }
        if (numbers.isEmpty()) {
            return List.of();
        }
        return numbers.stream()
                .filter(integer -> integer < 0)
                .collect(Collectors.toList());
    }
}
