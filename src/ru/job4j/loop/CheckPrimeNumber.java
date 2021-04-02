package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean canDivBy5 = false;
        if(number % 2 == 1){
            canDivBy5 = true;
        }
        else if(number == 2){
            canDivBy5 = true;
        }
        return canDivBy5;
    }

    public static void main(String[] args){
        System.out.println(check(2));

    }
}
