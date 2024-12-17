package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {
    @Test
    void whenMax7To9Then9() {
        int left = 7;
        int right = 9;
        int result = Max.number(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenMax23To17To0Then23() {
        int left = 23;
        int right = 17;
        int third = 0;
        int result = Max.number(left, right, third);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenMax89To3000To700To56Then3000() {
        int left = 89;
        int right = 3000;
        int third = 700;
        int fourth = 56;
        int result = Max.number(left, right, third, fourth);
        int expected = 3000;
        assertThat(result).isEqualTo(expected);
    }

}
