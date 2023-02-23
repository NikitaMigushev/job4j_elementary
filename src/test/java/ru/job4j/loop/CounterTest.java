package ru.job4j.loop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CounterTest {

    @Test
    void whenSumFrom0To5Then15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumFrom5To10Then45() {
        int start = 5;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 45;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumFrom10To20Then165() {
        int start = 10;
        int finish = 20;
        int result = Counter.sum(start, finish);
        int expected = 165;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenFrom0To5Then6() {
        int start = 0;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenFrom5To10Then24() {
        int start = 5;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenFrom10To20Then90() {
        int start = 10;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 90;
        Assertions.assertThat(result).isEqualTo(expected);
    }
}