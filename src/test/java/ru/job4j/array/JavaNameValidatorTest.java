package ru.job4j.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaNameValidatorTest {

    @Test
    void whenCode36ThenIsSpecialSymbolTrue() {
        int input = 36;
        boolean result = JavaNameValidator.isSpecialSymbol(input);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void whenCode95ThenIsSpecialSymbolTrue() {
        int input = 95;
        boolean result = JavaNameValidator.isSpecialSymbol(input);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void whenCode96ThenIsSpecialSymbolTrue() {
        int input = 96;
        boolean result = JavaNameValidator.isSpecialSymbol(input);
        Assertions.assertThat(result).isFalse();
    }

    @Test
    void whenCode65ThenIsUpperLatinLetterTrue() {
        int input = 65;
        boolean result = JavaNameValidator.isUpperLatinLetter(input);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void whenCode90ThenIsUpperLatinLetterTrue() {
        int input = 90;
        boolean result = JavaNameValidator.isUpperLatinLetter(input);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void whenCode64ThenIsUpperLatinLetterFalse() {
        int input = 64;
        boolean result = JavaNameValidator.isUpperLatinLetter(input);
        Assertions.assertThat(result).isFalse();
    }

    @Test
    void whenCode97ThenIsLowerLatinLetterTrue() {
        int input = 97;
        boolean result = JavaNameValidator.isLowerLatinLetter(input);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void whenCode122ThenIsLowerLatinLetterTrue() {
        int input = 122;
        boolean result = JavaNameValidator.isLowerLatinLetter(input);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void whenCode123ThenIsLowerLatinLetterTrue() {
        int input = 123;
        boolean result = JavaNameValidator.isLowerLatinLetter(input);
        Assertions.assertThat(result).isFalse();
    }

    @Test
    void whenEmptyNameInvalid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("")).isFalse();
    }

    @Test
    void whenFullLatValid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("first")).isTrue();
    }

    @Test
    void whenFullLatAndSomeUpperCaseLettersValid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("fIRST")).isTrue();
    }

    @Test
    void whenLatNumberValid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("first1")).isTrue();
    }

    @Test
    void whenLatWithSpecialSymbolUnderValid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("first_user")).isTrue();
    }

    @Test
    void whenNumberInValid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("123")).isFalse();
    }

    @Test
    void whenFirstLatinUpperCaseIsInvalid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("First")).isFalse();
    }

    @Test
    void whenLatNumberAndTwoSpecialSymbolsUnderValid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("fir$t_u$er_1")).isTrue();
    }
}