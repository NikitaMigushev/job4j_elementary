package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean item : data) {
            boolean check = data[0];
            if (check != item) {
                result = false;
                break;
            }
        }
        return result;
    }
}
