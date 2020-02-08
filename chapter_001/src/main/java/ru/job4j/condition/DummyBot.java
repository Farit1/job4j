package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            // Заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        } else {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return rsl;
    }
    public static void main(String[] args) {
        String question1 = "Привет, Бот.";
        System.out.println("Сообщение боту: " + question1);
        System.out.println("Бот: " + answer(question1));
        String question2 = "Пока.";
        System.out.println("Сообщение боту: " + question2);
        System.out.println("Бот: " + answer(question2));
        String question3 = "Как дела?";
        System.out.println("Сообщение боту: " + question3);
        System.out.println("Бот: " + answer(question3));
    }
}
