package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second){
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that){
        return sqrt(pow(this.x - that.x,2) + pow(this.y - that.y,2));
    }

    public double distance3d(Point that) {
        return   sqrt(pow(this.x - that.x,2) + pow(this.y - that.y,2) + pow(this.z - that.z,2));
    }

    public static void main(String[] args) {
        Point point = new Point(2,5);
        Point point2 = new Point(0,0);


        double result = point.distance(point2);
        System.out.println("result (2, 12) to (2, 9) " + result);
    }
}
