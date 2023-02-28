package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1); /*find value of min element in array*/
            int index = FindLoop.indexInRange(data, min, i, data.length - 1); /*find index of min element in array*/
            data = SwitchArray.swap(data, index, i);
        }
        return data;
    }
}
