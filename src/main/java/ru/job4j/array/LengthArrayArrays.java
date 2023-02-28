package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] anotherNumbers = {{1}, {1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива: " + numbers[i].length);
        }

        for (int i = 0; i < anotherNumbers.length; i++) {
            System.out.println("Размер второго вложенного массива: " + anotherNumbers[i].length);
            
        }
    }
}
