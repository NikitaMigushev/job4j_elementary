package ru.job4j.tasks;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = "привет";
        String s2 = "привет";
        String s3 = "Привет";
        String s4 = s3.toLowerCase();
        String s5 = s3.toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s2 == s4);
        System.out.println(s2 == s5);
    }
}
