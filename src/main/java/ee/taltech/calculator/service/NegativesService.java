package ee.taltech.calculator.service;

import java.util.List;
import java.util.stream.Collectors;

public class NegativesService {
    public static List<Integer> findNegatives(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }
        List<Integer> negatives = numbers.stream()
                .filter(integer -> integer < 0)
                .collect(Collectors.toList());
        return !negatives.isEmpty() ? negatives : null;
    }
}
