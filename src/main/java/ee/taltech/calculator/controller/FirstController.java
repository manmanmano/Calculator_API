package ee.taltech.calculator.controller;

import ee.taltech.calculator.dto.CalculationResult1;
import ee.taltech.calculator.dto.CalculationResult2;
import ee.taltech.calculator.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class FirstController {

    @GetMapping(value = "/calculator1")
    public CalculationResult1 calculation1(@RequestParam List<Integer> input) {
        CalculationResult1 result = new CalculationResult1();
        result.setMaxOdd(MaxOddService.MaxOdd(input));
        result.setSum(SumService.Sum(input));
        result.setNegatives(NegativesService.findNegatives(input));
        return result;
    }

    @GetMapping(value = "/calculator2")
    public CalculationResult2 calculation2(@RequestParam List<Integer> input) {
        CalculationResult2 result = new CalculationResult2();
        result.setSignReversed(SignReversedService.signReversed(input));
        result.setMaxOdd(MaxOddService.MaxOdd(input));
        result.setAverageOfEven(AverageOfEvenService.averageOfEven(input));
        return result;
    }
}
