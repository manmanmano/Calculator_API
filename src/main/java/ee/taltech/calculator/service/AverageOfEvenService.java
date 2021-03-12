package ee.taltech.calculator.service;

import java.util.List;
import java.util.stream.Collectors;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class AverageOfEvenService {

    public static Double averageOfEven(List<Integer> numbers) {
        if (numbers == null) {
            return null;
        }
        if (numbers.isEmpty()) {
            return (double) 0;
        }
        List<Integer> evens = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
        if (evens.isEmpty()) {
            return (double) 0;
        }
        int sum = evens.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return roundDouble((double) sum / evens.size());
    }

    private static double roundDouble(double avg) {
        BigDecimal rounded = new BigDecimal(Double.toString(avg));
        rounded = rounded.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }
}
