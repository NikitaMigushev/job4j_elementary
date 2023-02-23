package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SwitchWeekTest {

    @Test
    void whenDay1ThenNameMonday() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenDay2ThenNameTuesday() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenDay3ThenNameWednesday() {
        int day = 3;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Среда";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenDay1ThenNameThursday() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenDay5ThenNameFriday() {
        int day = 5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Пятница";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenDay6ThenNameSaturday() {
        int day = 6;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Суббота";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenDay7ThenNameMonday() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресенье";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void whenDay8ThenNameMonday() {
        int day = 8;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assertions.assertEquals(expected, result);
    }
}