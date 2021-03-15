package ee.taltech.calculator.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SignReversedService {
    public static List<Integer> signReversed(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("invalid input");
        }
        if (numbers.isEmpty()) {
            return List.of();
        }
        return numbers.stream()
                .map(integer -> -1 * integer)
                .collect(Collectors.toList());
    }
}
