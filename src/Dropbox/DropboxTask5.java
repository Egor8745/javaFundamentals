package Dropbox;

/**
 * Created by Egor on 04.01.2021.
 */
public class DropboxTask5 {//Создать двухмерный квадратный массив, и заполнить его "бабочкой", Вывести его на экран, заменив 1 символом *, а 0 - пробелом.


    public static void main(String[] args) {
        String[][] twoDimarray = {{"*", "*", "*", "*", "*"}, {" ", "*", "*", "*", " "}, {" ", " ", "*", " ", " "}, {" ", "*", "*", "*", " "}, {"*", "*", "*", "*", "*"}};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + twoDimarray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
