package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort34125Then12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort108642975310() {
        int[] data = new int[] {10, 8, 6, 4, 2, 9, 7, 5, 3, 1, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }
}