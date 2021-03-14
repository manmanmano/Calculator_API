package ee.taltech.calculator.Service;

import ee.taltech.calculator.service.MaxOddService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNull;

class MaxOddServiceTest {
    @Test
    @DisplayName("MaxOddService returns null on null")
    void MaxOddService_returns_null_on_null(){
        assertNull(MaxOddService.MaxOdd(null));
    }
    @Test
    @DisplayName("MaxOddService returns null on empty list")
    void MaxOddService_returns_null_on_empty_list(){
        assertNull(MaxOddService.MaxOdd(List.of()));
    }
    @Test
    @DisplayName("MaxOddService returns null on even numbers")
    void MaxOddService_returns_null_on_even_numbers(){
        MaxOddService.MaxOdd(List.of(2, 4, 6));
    }
    @Test
    @DisplayName("MaxOddService returns MaxOdd on numbers")
    void MaxOddService_returns_MaxOdd_on_numbers(){
        MaxOddService.MaxOdd(List.of(-2, -3, 2, 3, 4));
    }

}
