package ee.taltech.calculator.service;

import java.util.List;
import java.util.stream.Collectors;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class AverageOfEvenService {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 5, 76, 11, 10);
        System.out.println(averageOfEven(numbers));
    }

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
        if (evens.isEmpty()) {
            return Double.valueOf(0);
        }
        Integer sum = evens.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return roundDouble(((double) sum / evens.size()), 2);
    }

    private static double roundDouble(double avg, int places) {
        BigDecimal rounded = new BigDecimal(Double.toString(avg));
        rounded = rounded.setScale(places, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }
}
