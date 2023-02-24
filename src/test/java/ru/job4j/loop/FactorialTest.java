package ru.job4j.loop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class FactorialTest {

    @Test
    void whenCalc5Then120() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCalc0Then1() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCalc1Then1() {
        int n = 1;
        int result = Factorial.calc(n);
        int expected = 1;
        Assertions.assertThat(result).isEqualTo(expected);
    }
}