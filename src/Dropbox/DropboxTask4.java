package Dropbox;

/**
 * Created by Lenovo on 06.12.2020.
 */
public class DropboxTask4 {
    //Создать массив из 4 случайных целых чисел из отрезка [10;99],вывести его на экран в строку./

    // Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 90 + 10);
            array[i] = random;
            System.out.print(array[i] + " ");
        }

        if (isArrayGrowing(array)) {
            System.out.println(" Массив строго возрастающей последовательности");
        }
    }

    private static boolean isArrayGrowing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] >= array[i]) {
                return false;
            }
        }
        return true;
    }
}




