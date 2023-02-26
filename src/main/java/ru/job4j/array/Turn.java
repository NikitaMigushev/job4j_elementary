package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 1; i <= (array.length / 2); i++) {
            int temp = array[i - 1];
            int bound = array.length - i;
            array[i - 1] = array[bound];
            array[bound] = temp;
        }
        return array;
    }
}
