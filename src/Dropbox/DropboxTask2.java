package Dropbox;


/**
 * Created by Lenovo on 21.11.2020.
 */
public class DropboxTask2 {//Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его

    public static void main(String[] args) {
        int[] array = new int[100];
        int naturalNumber = 0;
        int i = 0;
        while (i < array.length) {
            if (naturalNumber % 13 == 0 || naturalNumber % 17 == 0) {
                array[i] = naturalNumber;
                i++;
            }
            naturalNumber++;
        }
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i]);
            }

        }
    }
}






