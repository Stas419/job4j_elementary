package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int num = source;
        int[] mass = new int[array.length];
        mass[0] = array[dest];
        array[dest] = array[source];
        array[source] = mass[0];
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array.length;
        array[5] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);

        int[] rs = swapBorder(nums);
        SwitchArray.swap(rs, 0,3);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
            System.out.println(rs[index]);



        }
    }
}
