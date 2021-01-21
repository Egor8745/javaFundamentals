package Dropbox;

/**
 * Created by Egor on 05.01.2021.
 */
public class DropboxTask7 {//Написать программу, эмулирующую выдачу случайной карты изколоды в 52 карты. Вывести результат в формате

    // "КартаofМасть". Например,"AceofSpades".Валет-Jack,Дама-Queen,Король-King,Туз-Ace,Червы-Hearts,Пики-Spades, Трефы-Clubs,Бубны-Diamonds
    public static void main(String[] args) {
        String[] cardsType = {"club", "spade", "heart", "diamond"};
        String[] cardValue = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "King", "Queen", "Jack"};
//        for (int i = 0; i <= cardsType.length - 1; i++) {
//            for (int j = 0; j <= cardValue.length - 1; j++) {
                int randomI=(int)(Math.random()*4);
                int randomJ=(int)(Math.random()*13);
                System.out.println(cardsType[randomI] + " " + "of" + " " + cardValue[randomJ]);
//                break;
//            }
//            break;
//        }
    }


    //todo add method getOfCards that return Array with all cards
}



