package Dropbox;

public class DropboxTask3 {
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
        for(int i =0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
}
