package ee.taltech.calculator.service;

import java.util.List;

public class MaxOddService {
    public static Integer MaxOdd(List<Integer> numbers){
        return numbers.stream()
                .filter(x -> x % 2 != 0)
                .max(Integer::compareTo)
                .orElse(0);
    }
}
