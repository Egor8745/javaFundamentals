package Dropbox;

import java.util.Arrays;

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
        array2[1][2] = 1;
boolean aquals = arrayaquals(array1,array2);
           System.out.println(aquals);
       }
       private static boolean arrayaquals(int [][] array1,int [][] array2){
         boolean a = Arrays.deepEquals(array1,array2);
         return  a;
       }

}
