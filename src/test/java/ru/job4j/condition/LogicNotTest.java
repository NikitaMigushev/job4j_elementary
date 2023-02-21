package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LogicNotTest {

    @Test
    void whenIsEven2thenTrue() {
        int num = 2;
        boolean result = LogicNot.isEven(num);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIsEven3thenFalse() {
        int num = 3;
        boolean result = LogicNot.isEven(num);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIsPositive1ThenTrue() {
        int num = 1;
        boolean result = LogicNot.isPositive(num);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIsPositiveMinus1ThenFalse() {
        int num = -1;
        boolean result = LogicNot.isPositive(num);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotEven1ThenTrue() {
        int num = 1;
        boolean result = LogicNot.notEven(num);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotEven2ThenFalse() {
        int num = 2;
        boolean result = LogicNot.notEven(num);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotPositiveMinus1ThenTrue() {
        int num = -1;
        boolean result = LogicNot.notPositive(num);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotPositive1ThenFalse() {
        int num = 1;
        boolean result = LogicNot.notPositive(num);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotEvenAndPositive3ThenTrue() {
        int num = 3;
        boolean result = LogicNot.notEvenAndPositive(num);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotEvenAndPositive2ThenFalse() {
        int num = 2;
        boolean result = LogicNot.notEvenAndPositive(num);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotEvenAndPositiveMinus3ThenFalse() {
        int num = -3;
        boolean result = LogicNot.notEvenAndPositive(num);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEvenOrNotPositive2ThenTrue() {
        int num = 2;
        boolean result = LogicNot.evenOrNotPositive(num);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEvenOrNotPositiveMinus1ThenTrue() {
        int num = -1;
        boolean result = LogicNot.evenOrNotPositive(num);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEvenOrNotPositiveMinus3ThenFalse() {
        int num = 3;
        boolean result = LogicNot.evenOrNotPositive(num);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }
}