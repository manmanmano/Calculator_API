package ee.taltech.calculator.Service;

import ee.taltech.calculator.service.NegativesService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class NegativesServiceTest {

    @Test
    @DisplayName("empty list as input returns null")
    void negativesService_on_empty_list_returns_empty() {
        assertEquals(null, NegativesService.findNegatives(List.of()));
    }

    @Test
    @DisplayName("null list as input returns null")
    void negativesService_on_null_returns_null() {
        assertNull(NegativesService.findNegatives(null));
    }

    @Test
    @DisplayName("list of positives returns empty list")
    void negativesService_positive_list_returns_null() {
        assertNull(NegativesService.findNegatives(List.of(1, 2, 3, 4, 5)));
    }

    @Test
    @DisplayName("list of  numbers negatives list")
    void negativesService_numbers_list_returns_negatives() {
        assertEquals(List.of(-1, -2, -3, -4), NegativesService.findNegatives(List.of(1, -1, 2, -2, 3, -3, 4, -4)));
        assertEquals(List.of(-1, -34, -22, -7), NegativesService.findNegatives(List.of(1, -1, 23, -34, -22, 50, -7)));
    }
}
