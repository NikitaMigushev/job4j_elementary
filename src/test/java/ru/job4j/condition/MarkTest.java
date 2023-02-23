package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarkTest {

    @Test
    void whenMark5thenExcellent() {
        int mark = 5;
        String result = Mark.mark(mark);
        String expected = "Отлично";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenMark4thenGood() {
        int mark = 4;
        String result = Mark.mark(mark);
        String expected = "Хорошо";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenMark3thenSatisfied() {
        int mark = 3;
        String result = Mark.mark(mark);
        String expected = "Удовлетворительно";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenMark2thenUnsatisfied() {
        int mark = 2;
        String result = Mark.mark(mark);
        String expected = "Неудовлетворительно";
        Assertions.assertEquals(expected, result);
    }
}