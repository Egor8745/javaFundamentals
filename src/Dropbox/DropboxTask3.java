package Dropbox;

public class DropboxTask3 {
    public static void main(String[] args) {//Определить сумму элементов целочисленного массива,расположенных между минимальным и максимальным значениями
        int[] array = generateRandomIntArray(6);

        DropboxTask2.printArray(array);

        int min = array[0];
        int max = array[0];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 1; i <= array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        int sum = sumArray(array, indexMax, indexMin);
        System.out.println("Сумма элементов равна : " + sum);
    }

    private static int sumArray(int[] array, int indexMax, int indexMin) {
        int sum = 0;
        int startPosition;
        int endPosition;
        if (indexMin < indexMax) {
            startPosition = indexMin;
            endPosition = indexMax;
        } else {
            startPosition = indexMax;
            endPosition = indexMin;
        }
        System.out.println("start position:" + startPosition + "; end position:" + endPosition);
        for (int i = startPosition; i <= endPosition; i++) {
            sum += array[i];
        }
        return sum;
    }

    protected static int[] generateRandomIntArray(int arrayLength) {
        if (arrayLength < 1) {
            System.out.println("N/A array");
            return null;
        }

        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 50);
            array[i] = random;
        }
        return array;
    }
}

