package Dropbox;

/**
 * Created by Egor on 04.01.2021.
 */
public class DropboxTask5 {//Создать двухмерный квадратный массив, и заполнить его "бабочкой", Вывести его на экран, заменив 1 символом *, а 0 - пробелом.

    public static void main(String[] args) {
        byte[][] array = createButterfly(5);
        printArray(array);
        char[][] charArray = createCharButterfly(array);
        printCharArray(charArray);


    }

    private static byte[][] createButterfly(int size) {
        byte array[][] = new byte[size][size];
        for (int i = 0; i < array.length / 2 + 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= (array[i].length - i)))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }
        for (int i = array.length - 1; i >= array.length / 2 + 1; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j < (array[i].length - 1 - i)) || (j > i))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }
        return array;
    }

    private static void printArray(byte[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    private static char[][] createCharButterfly(byte[][] array) {
        char[][] charArray = new char[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    charArray[i][j] = ' ';
                } else {
                    charArray[i][j] = '*';
                }
            }
        }
        return charArray;
    }

    private static void printCharArray(char[][] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                System.out.print(" " + charArray[i][j] + " ");
            }
            System.out.println(" ");

        }
    }
}

