package ru.job4j.condition;

public class Mark {

    public static String mark(int score) {
    String mark;
    switch (score) {
        case 5:
            mark = "Отлично";
            break;
        case 4:
            mark = "Хорошо";
            break;
        case 3:
            mark = "Удовлетворительно";
            break;
        default:
            mark = "Неудовлетворительно";
    }
    return mark;
}
}
