package Dropbox;

/**
 * Created by Lenovo on 21.11.2020.
 */
public class DropboxTask1 {//Напишите программу, которая печатает массив сначала обычном порядке, затем в обратном

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Обычный порядок массива");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Обратный порядок массива");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
