package ru.job4j.loop;

public class Board {
    public static void pain(int width, int height){
        for (int i = 0; i < width; i++ ) {
            for (int j = 0; j < height; j++ ) {

                if (i  % 2 == 0 & j  % 2 == 0  ) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args){

        pain(3,3);
        System.out.println();
        pain(4,4);
    }
}
