package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el, int start, int finish){
        int result = -1;
        for (int i = start; i < finish ; i++) {
            if(data[i] == el){
                result = data[i];
                break;
            }
        }
        return result;
    }

    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] mass = new int[5];
        System.out.println(indexOf(mass,1));
    }
}
