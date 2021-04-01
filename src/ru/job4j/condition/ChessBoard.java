package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rsl =  Math.abs(y2 - y1);
        }
        return rsl;
    }
    public static void main (String[] args){
        int s = ChessBoard.way(1 , 1, 5, 5);
        System.out.print(s);
    }
}
