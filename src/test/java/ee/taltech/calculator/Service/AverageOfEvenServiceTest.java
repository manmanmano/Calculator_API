package ee.taltech.calculator.Service;

import ee.taltech.calculator.dto.AverageOfEven;
import ee.taltech.calculator.service.AverageOfEvenService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

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


}
