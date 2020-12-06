package Dropbox;


/**
 * Created by Lenovo on 21.11.2020.
 */
public class DropboxTask2 {//Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его

    public static void main(String[] args) {
        int[] array = new int[100];
        int i = 0;
        int g = 0;
            while (i<array.length) {
                if (g % 13 == 0 || g % 17 == 0) {
                    array[i] = g;
                    System.out.println(g);
                    i++;
                    g++;

                } else {
                    g++;
                }

            }

        }
    }






