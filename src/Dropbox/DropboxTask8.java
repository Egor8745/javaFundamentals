package Dropbox;

/**
 * Created by Egor on 11.01.2021.
 */
public class DropboxTask8 {
    public static void main(String[] args) {//Написать программу, перемешивающую и печатающую списоккарт в колоде. Воспользоваться результатом предыдущей задачи.
        String[][] Card = {{"2 of Hearts", "2 of Spades", "2 of Clubs", "2 of Diamonds"}, {"3 of Hearts", "3 of Spades", "3 of Clubs", "3 of Diamonds"}, {"4 of Hearts", "4 of Spades", "4 of Clubs", "4 of Diamonds"}, {"5 of Hearts", "5 of Spades", "5 of Clubs", "5 of Diamonds"}, {"6 of Hearts", "6 of Spades", "6 of Clubs", "6 of Diamonds"}, {"7 of Hearts", "7 of Spades", "7 of Clubs", "7 of Diamonds"}, {"8 of Hearts", "8 of Spades", "8 of Clubs", "8 of Diamonds"}, {"9 of Hearts", "9 of Spades", "9 of Clubs", "9 of Diamonds"}, {"10 of Hearts", "10 of Spades", "10 of Clubs", "10 of Diamonds"}, {"Jack of Hearts", "Jack of Spades", "Jack of Clubs", "Jack of Diamonds"}, {"Queen of Hearts", "Queen of Spades", "Queen of Clubs", "Queen of Diamonds"}, {"King of Hearts", "King of Spades", "King of Clubs", "King of Diamonds"}, {"Ase of Hearts", "Ase of Spades", "Ase of Clubs", "Ase of Diamonds"}};
        for (int i = 0; i < 13; ) {
            i = (int) (Math.random() * Card.length);
            for (int j = 0; j < 4; ) {
                j = (int) (Math.random() * 4);
                System.out.println("Random card: "+ Card[i][j]);
                break;
            }
            break;
        }
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(" " + Card[i][j] + " ");
            }
        }
    }
    }

