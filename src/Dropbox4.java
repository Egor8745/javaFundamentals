/**
 * Created by acer on 28.11.2020.
 */
public class Dropbox4 {//Создать массив из 4 случайных целых чисел из отрезка [10;99],вывести его на экран в строку.

    // Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 90 + 10);
            array[i] = random;
            System.out.print(array[i] + " ");
        }
        boolean check = Checkarrey(array);
        if (check == true) {
            System.out.println("Массив строго возрастающей последовательности");
        }
    }
    private static boolean Checkarrey(int[] array) {
        boolean a = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                a = true;
            } else {
                a = false;
                break;
            }
        }
        return a;
    }
}
