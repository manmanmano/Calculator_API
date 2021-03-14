package ee.taltech.calculator.Service;

import ee.taltech.calculator.service.SumService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNull;


class SumServiceTest {

    @Test
    @DisplayName("SumService returns null on null")
    void SumService_returns_null_on_null(){
        assertNull(SumService.Sum(null));
    }
    @Test
    @DisplayName("SumService returns null on empty list")
    void SumService_returns_null_on_empty_list(){
        assertNull(SumService.Sum(List.of()));
    }
    @Test
    @DisplayName("SumService returns sum of positive numbers")
    void SumService_returns_sum_of_positive_numbers(){
        SumService.Sum(List.of(2, 3, 5));
    }
    @Test
    @DisplayName("SumService returns sum of negative numbers")
    void SumService_returns_sum_of_negative_numbers(){
        SumService.Sum(List.of(-2, -3, -5));
    }
}
