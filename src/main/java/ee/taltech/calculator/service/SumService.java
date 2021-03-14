package ee.taltech.calculator.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SumService {
    public static Integer Sum(List<Integer> numbers){
        if (numbers == null || numbers.isEmpty() ){
            return null;
        }
        return numbers.stream()
                .reduce(0, Integer::sum);
    }
}
