package ru.job4j.math;

public class RandomNumber {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        System.out.println(getRandomNumber(1, 36));
    }
}
