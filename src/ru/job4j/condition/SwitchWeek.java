package ru.job4j.condition;

public class SwitchWeek {

    public static String nameOfDay(int day){
        String name;
        switch(day) {
            case 1:
                name = "понедельник";
                break;
            case 2:
                name = "вторник";
                break;
            case 3:
                name = "среда";
                break;
            case 4:
                name = "четверг";
                break;
            case 5:
                name = "пятница";
                break;
            case 6:
                name = "субота";
                break;
            case 7:
                name = "воскресение";
                break;
            default:
                name = "в неделе 7 дней";
                break;
        }
        return name;
    }
    public static void main(String[] args){
       String name = SwitchWeek.nameOfDay(5);
       System.out.println(name);
    }

}
