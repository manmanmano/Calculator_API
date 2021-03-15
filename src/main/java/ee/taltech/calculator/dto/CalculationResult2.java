package ee.taltech.calculator.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CalculationResult2 {
    private List<Integer> signReversed;
    private Integer maxOdd;
    private Double averageOfEven;
}
