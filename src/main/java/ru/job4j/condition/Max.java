package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
        }
    }

    public static int max(int first, int second, int third, int fourth) {
        if (first > second && first > second && first > third && first > fourth) {
            return first;
        } else if (second > first && second > third && second > fourth) {
            return second;
        } else if (third > first && third > second && third > fourth) {
            return third;
        } else {
            return fourth;
        }
    }
}



