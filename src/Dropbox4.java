import java.util.Random;

/**
 * Created by acer on 28.11.2020.
 */
public class Dropbox4 {//Создать массив из 4 случайных целых чисел из отрезка [10;99],вывести его на экран в строку.

    // Определить и вывести на экран сообщение о том, является лимассив строго возрастающей последовательностью.
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 90 + 10);
            array[i] = random;
            System.out.print(array[i] + " ");
        }
        if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]) {
            System.out.println("Массив строго возрастающей последовательности ");
            //переделать isArrayGrowing
        }
    }
}
