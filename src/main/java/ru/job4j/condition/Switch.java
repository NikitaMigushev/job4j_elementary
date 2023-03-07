package ru.job4j.condition;

public class Switch {
    public static void main(String[] args) {
        String light = "Red";
        switch (light) {
            case "Red" -> System.out.println("Stop");
            case "Yellow" -> System.out.println("Prepare");
            case "Green" -> System.out.println("Go");
            default -> System.out.println("Do Nothing");
        }
    }
}
