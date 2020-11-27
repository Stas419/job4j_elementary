package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 1;
        if ( x2 == y2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        else{
            rsl = 0;
        }
        return rsl;
    }




    public static void main(String[] args){
       int s =  ChessBoard.way(1,0,5,5);
       System.out.print(s);
    }


}
