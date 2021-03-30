package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String str) {
        return switch (str) {
            case "понедельник", "Monday" -> 1;
            case "вторник", "Monday2" -> 2;
            case "среда", "Monday3" -> 3;
            case "четверг", "Monday4" -> 4;
            case "пятница", "Monday5" -> 5;
            case "субота", "Monday6" -> 6;
            case "воскресение", "Monday7" -> 7;

            default -> -1;
        };
    }
    public static void main(String[] args){
        int num = MultipleSwitchWeek.numberOfDay("субота");
        System.out.println(num);
    }
}
