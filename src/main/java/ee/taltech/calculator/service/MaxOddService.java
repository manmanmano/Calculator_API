package ee.taltech.calculator.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MaxOddService {
    public static Integer MaxOdd(List<Integer> numbers){
        if (numbers == null || numbers.isEmpty()){
            return null;
        }
        return numbers.stream()
                .filter(x -> x % 2 != 0)
                .max(Integer::compareTo)
                .orElse(null);
    }
}
