package Dropbox;

/**
 * Created by Егор on 22.02.2021.
 */
public class ArrayHomeWork4 {
    public static void main(String[] args) {//Написать функцию linearize, которая принимает в качестве параметра двумерный массив и возвращает одномерный массив со всеми элементами двумерного
        int [][] array = new int[3][3];
        int [] newArray = linearize(array);
        System.out.println("Массив после конвертирования: ");
        for (int i=0;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }
    private static int[] linearize(int[][] array){
       int [] array2 = new int[array.length*array.length];
        System.out.println("Исходный массив: ");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                array[i][j]=(int)(Math.random()*10);
                System.out.println(array[i][j]);
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++) {
                array2[i*array.length+j]=array[i][j];
            }
        }
        for(int i=0;i<array2.length;i++){
        }
        return array2;
    }
}
