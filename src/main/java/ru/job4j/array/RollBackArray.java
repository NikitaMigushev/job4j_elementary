package ru.job4j.array;

public class RollBackArray {

    /*writes elements to a new array, but in reverse order*/
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result[index] = array[array.length - index - 1];
        }
        return result;
    }
}
