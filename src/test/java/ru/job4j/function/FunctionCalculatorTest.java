package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {
    @Test
    void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
        void whenQuadraticFunctionThenQuadraticResults() {
            FunctionCalculator function = new FunctionCalculator();
            List<Double> result = function.diapason(2, 5, x -> x * x);
            List<Double> expected = Arrays.asList(4D, 9D, 16D);
            assertThat(result).containsAll(expected);
        }
    @Test
    void whenExponentialFunctionThenExponentialResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(6, 12, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(64D, 128D, 256D,512D,1024D, 2048D);
        assertThat(result).containsAll(expected);
    }
}