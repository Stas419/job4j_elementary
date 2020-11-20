package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ста вит меня в тупик. Задайте  другой вопрос!";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
            System.out.println(rsl);
        }
        else if ("пока".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }


    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет , Бот.");
        System.out.println(rsl);
    }
}
