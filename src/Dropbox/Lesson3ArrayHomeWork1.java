package Dropbox;

/**
 * Created by Егор on 31.01.2021.
 */
public class Lesson3ArrayHomeWork1 {//Напишите программу, которая циклически сдвигает элементымассива вправо на одну позицию, и печатает результат.

    // Цикличность означает, что последний элемент массива становится самым первым его элементом.
    public static void main(String[] args) {
        int[] array = new int[10];
        shiftArray(array);


    }

    private static void shiftArray(int[] shiftArray) {
        System.out.print("Изначальный массив ");
        for (int i = 0; i < shiftArray.length; i++) {
            shiftArray[i] = (int) (Math.random() * 10);
            System.out.print(shiftArray[i]);
        }
        int temp = shiftArray[shiftArray.length - 1];
        for (int i = shiftArray.length - 2; i >= 0; i--) {
            shiftArray[i + 1] = shiftArray[i];
        }
        shiftArray[0] = temp;
        System.out.print("  Массив после сдвига ");
        for (int i = 0; i < shiftArray.length; i++) {
            System.out.print(shiftArray[i]);
        }
    }
}
