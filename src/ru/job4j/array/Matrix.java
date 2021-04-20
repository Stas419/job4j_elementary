package ru.job4j.array;

public class Matrix {
    public  static int[][] multiple(int size){
        int[][] mass = new int[size][size];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length ; j++) {
                mass[i][j] *= 9;
                System.out.println(mass[i][j]);
            }
        }
        return mass;
    }
}
