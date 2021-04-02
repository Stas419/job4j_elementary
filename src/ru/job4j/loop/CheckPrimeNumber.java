package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean canDivBy5 = number > 1;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                canDivBy5 = false;
            }
        }
        return canDivBy5;
    }

    public static void main(String[] args){
        System.out.println(check(11));

    }
}
