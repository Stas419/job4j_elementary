package ru.job4j.condition;

public class Pint {
    public static double distance(int x1, int y1, int x2, int y2) {
        double vichetanieX = x2 - x1;
        double vichetanieY = y2 - y1;
        double stepen = Math.pow(vichetanieX, 2) + Math.pow(vichetanieY, 2);
        double koren = Math.sqrt(stepen);

        return koren;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2 , 0) " + result);
    }
}
