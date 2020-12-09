package Dropbox;


public class DropboxTask3 {
    public static void main(String[] args) {//Определить сумму элементов целочисленного массива,расположенных между минимальным и максимальным значениями
        int[] array = new int[6];
        int sum=0;
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
                indexmax=i;
            }
            if (min > array[i]) {
                min = array[i];
                indexmin=i;
            }
        }

        System.out.println(sum);

        }

    }

