package Dropbox;

/**
 * Created by Egor on 05.01.2021.
 */
public class DropboxTask6 {// Написать метод equals, который определяет, равны ли междусобой соответствующие элементы 2-х двумерных массивов.

    public static void main(String[] args) {
        int[][] array1 = new int[2][3];
        array1[0][0] = 1;
        array1[0][1] = 1;
        array1[0][2] = 1;
        array1[1][0] = 1;
        array1[1][1] = 1;
        array1[1][2] = 1;
        int[][] array2 = new int[2][3];
        array2[0][0] = 1;
        array2[0][1] = 1;
        array2[0][2] = 1;
        array2[1][0] = 1;
        array2[1][1] = 1;
        array2[1][2] = 0;

        System.out.println(!arrayEquals(array1, array2) ? " Массивы не равны" : " Массивы равны");
    }

    private static boolean arrayEquals(int[][] array1, int[][] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1.length != array2.length || array1[0].length != array2[0].length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != array2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
