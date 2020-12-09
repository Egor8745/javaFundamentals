package Dropbox;

import java.util.Scanner;

/**
 * Created by Lenovo on 21.11.2020.
 */
public class DropboxTask1 {//Напишите программу, которая печатает массив сначала обычном порядке, затем в обратном

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Длинна массива: ");
        int arrayLength = scan.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Переменные массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Обычный порядок массива: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Обратный порядок массива");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
