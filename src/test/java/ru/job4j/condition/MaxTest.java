package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = second;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int first = 2;
        int second = 1;
        int result = Max.max(first, second);
        int expected = first;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax15To20Then20() {
        int first = 15;
        int second = 20;
        int result = Max.max(first, second);
        int expected = second;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To1Then1() {
        int first = 1;
        int second = 1;
        int result = Max.max(first, second);
        int expected = second;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int first = 1;
        int second = 1;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = third;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int first = 1;
        int second = 1;
        int third = 3;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = fourth;
        assertThat(result).isEqualTo(expected);
    }
}