package Dropbox;


/**
 * Created by Lenovo on 21.11.2020.
 */
public class DropboxTask2 {//Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его

    public static void main(String[] args) {//Определить сумму элементов целочисленного массива,расположенных между минимальным и максимальным значениями
        int[] array = new int[100];
        int g = 0;
        int i = 0;
        while (i < array.length) {
            if (g % 13 == 0 || g % 17 == 0) {
                array[i] = g;
                g++;
                i++;
            } else {
                g++;
            }
        }
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}






