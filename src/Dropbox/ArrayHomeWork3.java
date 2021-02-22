package Dropbox;


/**
 * Created by Егор on 22.02.2021.
 */
public class ArrayHomeWork3 {//Заданы 2 массива целых чисел произвольной длины. Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных

    public static void main(String[] args) {
        int[] array1 = {1, 4, 6, 7, 8};
        int[] array2 = {7, 6, 2, 5, 5, 5, 5, 4, 56,};
        int[] result = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }
        for (int i = array1.length; i < result.length; i++) {
            result[i] = array2[i - array1.length];
        }
        System.out.println("Итоговый массив: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

