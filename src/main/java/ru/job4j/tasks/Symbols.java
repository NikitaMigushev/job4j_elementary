package ru.job4j.tasks;

public class Symbols {

    public static void main(String[] args) {
        char c1 = '\u0035';
        char c2 = '\u004D';
        char c3 = '\u006E';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("\u0031\u0032\u0033");
        char a = 'A';
        char b = 'B';
        System.out.println(a + b);
        int d = 'A';
        int c = 'B';
        System.out.println("A: " + d);
        System.out.println("B: " + c);
        System.out.println("A + B: " + (d + c));

        char e = 'A';
        System.out.println(++e);
        char f = 'D';
        System.out.println(--f);
    }
}
