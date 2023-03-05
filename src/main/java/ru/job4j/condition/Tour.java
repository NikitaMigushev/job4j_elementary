package ru.job4j.condition;

public class Tour {
    public static void offer(boolean passpport) {
        System.out.println("A client has foreign passport: " + passpport);
        if (passpport) {
            System.out.println("Tours abroad.");
        } else {
            System.out.println("Tours in Russia.");
        }
    }

    public static void main(String[] args) {
        Tour.offer(true);
        Tour.offer(false);
    }
}
