package ee.taltech.calculator.Service;

import ee.taltech.calculator.dto.AverageOfEven;
import ee.taltech.calculator.service.AverageOfEvenService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

import static ee.taltech.calculator.service.AverageOfEvenService.roundDouble;
import static org.junit.jupiter.api.Assertions.*;

public class AverageOfEvenServiceTest {

    @Test
    @DisplayName("AverageOfEvenService returns null on null")
    void AverageOfEvenService_returns_null_on_null() {
        assertNull(AverageOfEvenService.averageOfEven(null));
    }

    @Test
    @DisplayName("AverageOfEvenService returns 0.0 on empty list")
    void AverageOfEvenService_returns_zero_on_empty() {
        assertNotNull(AverageOfEvenService.averageOfEven(List.of()));
    }

    @Test
    @DisplayName("AverageOfEvensService returns 0.0 on odd list")
    void AverageOfEvensService_returns_zero_on_odd_list() {
        assertEquals(Double.valueOf(0), AverageOfEvenService.averageOfEven(List.of(1, 3, 5, 7)));
    }

    @Test
    @DisplayName("AverageOfEvensService returns average of even numbers on number list")
    void AverageOfEvensService_returns_average_of_evens_on_number_list() {
        assertEquals(roundDouble((double) 86/3), AverageOfEvenService.averageOfEven(List.of(1, 4, 5, 10, 11, 72)));
        assertEquals( 8, AverageOfEvenService.averageOfEven(List.of(12, 1, 3, 4, 11, 23, 8)));
    }
}
