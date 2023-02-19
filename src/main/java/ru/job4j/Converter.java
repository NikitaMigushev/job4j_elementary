package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubbleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubbles are " + euro + " euro.");
        float dollar = Converter.rubbleToDollar(140);
        System.out.println("140 rubbles are " + dollar + " dollar.");

        float inForTestRubbleToEuro = 140;
        float expectedForTestRubbleToEuro = 2;
        float outForTestRubbleToEuro = Converter.rubleToEuro(inForTestRubbleToEuro);
        boolean passedForTestRubbleToEuro = expectedForTestRubbleToEuro == outForTestRubbleToEuro;
        System.out.println("140 rubbles are 2. Test result: " + passedForTestRubbleToEuro);

        float inForTestRubbleToDollar = 160;
        float expectedForTestRubbleToDollar = inForTestRubbleToDollar / 60;
        float outForTestRubbleToDollar = Converter.rubbleToDollar(inForTestRubbleToDollar);
        boolean passedForTestRubbleToDollar = expectedForTestRubbleToDollar == outForTestRubbleToDollar;
        System.out.println("160 rubbles are " + expectedForTestRubbleToDollar + " dollar. Test result: " + passedForTestRubbleToDollar);
    }
}


