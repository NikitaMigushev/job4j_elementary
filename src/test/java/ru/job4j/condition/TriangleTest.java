package ru.job4j.condition;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void whenNotExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 10.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assertions.assertThat(result).isFalse();
    }
}