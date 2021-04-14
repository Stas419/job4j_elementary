package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array){
        int num = 0;
        for(int i = 0; i < array.length/2; i++){
            num = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = num;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = Turn.back(nums);

        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
    }

}
