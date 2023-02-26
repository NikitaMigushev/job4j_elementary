package ru.job4j.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        Assertions.assertThat(result).containsExactly(expected);
    }

    @Test
    void whenBound5Then01416256() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        Assertions.assertThat(result).containsExactly(expected);
    }
}