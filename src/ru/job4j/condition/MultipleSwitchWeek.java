package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String str) {
        return switch (str) {
            case "понедельник", "Monday" -> 1;
            case "вторник", "Tuesday" -> 2;
            case "среда", "Wednesday" -> 3;
            case "четверг", "Thursday" -> 4;
            case "пятница", "Friday" -> 5;
            case "субота", "Saturday" -> 6;
            case "воскресение", "Sunday" -> 7;

            default -> -1;
        };
    }
    public static void main(String[] args){
        int num = MultipleSwitchWeek.numberOfDay("субота");
        System.out.println(num);
    }
}
