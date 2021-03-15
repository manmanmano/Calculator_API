package ee.taltech.calculator.controller;

import org.hamcrest.core.IsNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
public class FirstControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("calculator1 must have List<Integer> input")
    void calculator1MustHaveListIntegerInput() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calculator1"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    @DisplayName("calculator2 must have List<Integer> input")
    void calculator2MustHaveListIntegerInput() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calculator2"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    @DisplayName("calculator1 does not fail on empty input")
    void calculator1DoesNotFailOnEmptyInput() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calculator1?input="))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.maxOdd").value(IsNull.nullValue()))
                .andExpect(jsonPath("$.sum").value(IsNull.nullValue()))
                .andExpect(jsonPath("$.negatives").value(IsNull.nullValue()));
    }

    @Test
    @DisplayName("calculator2 does not fail on empty input")
    void calculator2DoesNotFailOnEmptyInput() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calculator2?input="))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.signReversed").value(IsNull.nullValue()))
                .andExpect(jsonPath("$.maxOdd").value(IsNull.nullValue()))
                .andExpect(jsonPath("$.averageOfEven").value( IsNull.nullValue()));
    }

    @Test
    @DisplayName("calculator1 returns a response")
    void calculator1DoesReturnAResponse() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calculator1?input=1,-5,-7,8,99"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.maxOdd").value(99))
                .andExpect(jsonPath("$.sum").value(96))
                .andExpect(jsonPath("$.negatives").isArray())
                .andExpect(jsonPath("$.negatives", hasSize(2)))
                .andExpect(jsonPath("$.negatives", containsInAnyOrder(-5, -7)));
    }

    @Test
    @DisplayName("calculator2 returns a response")
    void calculator2DoesReturnAResponse() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calculator2?input=4,7,3,-9,-5"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.signReversed").isArray())
                .andExpect(jsonPath("$.signReversed", hasSize(5)))
                .andExpect(jsonPath("$.signReversed", containsInAnyOrder(-4, -7, -3, 9, 5)))
                .andExpect(jsonPath("$.maxOdd").value(7))
                .andExpect(jsonPath("$.averageOfEven").value(4.0));
    }


}

