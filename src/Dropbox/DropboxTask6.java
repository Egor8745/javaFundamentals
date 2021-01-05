package Dropbox;

/**
 * Created by Egor on 05.01.2021.
 */
public class DropboxTask6 {// Написать метод equals, который определяет, равны ли междусобой соответствующие элементы 2-х двумерных массивов.

    public class Array {
        int dnaCode;

        public boolean equals(Array array) {
            return this.dnaCode == array.dnaCode;
        }

        public void main(String[] args) {
            int[][] array1 = new int[5][5];
            int[][] arrey2 = new int[5][5];
            System.out.println(array1.equals(arrey2));

        }

    }
}