package Dropbox;

public class DropboxTask3 {
    public static void main(String[] args) {//Определить сумму элементов целочисленного массива,расположенных между минимальным и максимальным значениями
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 50);
            array[i] = random;
        }
        if (array == null || array.length < 1)
            return;
        int min = array[0];
        int max = array[0];
        int indexmin = 0;
        int indexmax = 0;

        for (int i = 1; i <= array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
                indexmax = i;
            }
            if (min > array[i]) {
                min = array[i];
                indexmin = i;
            }
        }
        int SumindexArray = sumArray(array, indexmax, indexmin);
        System.out.println("Сумма элементов равна : " + SumindexArray);
    }

    private static int sumArray(int[] array, int indexmax, int indexmin) {
        int SumindexArray = 0;
        int sum = 0;
        int x;
        if (indexmin < indexmax) {
            x = indexmin;
        } else {
            x = indexmax;
        }
        for (int i = x; indexmin < indexmax ? i <= indexmax : i <= indexmin; i++) {
            sum += array[i];
            SumindexArray = sum;
        }
        return SumindexArray;
    }
}

