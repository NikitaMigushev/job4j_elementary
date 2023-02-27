package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean item : data) {
            if (data[0] != item) {
                result = false;
                break;
            }
        }
        return result;
    }
}
