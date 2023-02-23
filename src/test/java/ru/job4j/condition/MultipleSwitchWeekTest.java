package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleSwitchWeekTest {

    @Test
    void whenMondayEngThen1() {
        String day = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenMondayRusThen1() {
        String day = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenTuesdayEngThen2() {
        String day = "Tuesday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 2;
        Assertions.assertEquals(result, expected);
    }
    @Test
    void whenTuesdayRusThen2() {
        String day = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 2;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenWednesdayEngThen3() {
        String day = "Wednesday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 3;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenWednesdayRusThen3() {
        String day = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 3;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenThursdayEngThen4() {
        String day = "Thursday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 4;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenThursdayRusThen4() {
        String day = "Четверг";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 4;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenFridayEngThen5() {
        String day = "Friday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenFridayRusThen5() {
        String day = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenSaturdayEngThen6() {
        String day = "Saturday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenSaturdayRusThen6() {
        String day = "Суббота";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenSundayEngThen7() {
        String day = "Sunday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 7;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenSundayRusThen7()  {
        String day = "Воскресенье";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 7;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenNotWeekDayThenMinus1() {
        String day = "Not a weekday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = -1;
        Assertions.assertEquals(result, expected);
    }
}