package ee.taltech.calculator.service;

import java.util.List;

public class SumService {
    public static Integer Sum(List<Integer> numbers){
        return numbers.stream()
                .reduce(0, Integer::sum);
    }
}
