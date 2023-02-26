package ru.job4j.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TurnTest {

    @Test
    void when123Then321() {
        int[] array = {1, 2, 3};
        int[] result = Turn.back(array);
        int[] expected = {3, 2, 1};
        Assertions.assertThat(result).containsExactly(expected);
    }

    @Test
    void when345Then543() {
        int[] array = {3, 4, 5};
        int[] result = Turn.back(array);
        int[] expected = {5, 4, 3};
        Assertions.assertThat(result).containsExactly(expected);
    }

    @Test
    void when12345678910Then10987654321() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = Turn.back(array);
        int[] expected = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Assertions.assertThat(result).containsExactly(expected);
    }

    @Test
    void when1234567891011Then1110987654321() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] result = Turn.back(array);
        int[] expected = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Assertions.assertThat(result).containsExactly(expected);
    }
}