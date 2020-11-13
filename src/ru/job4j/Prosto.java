package ru.job4j;

public class Prosto {
    public static boolean Doubles(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String [] args){
       boolean num =  Prosto.Doubles(24);

       System.out.print(num);
    }

}
