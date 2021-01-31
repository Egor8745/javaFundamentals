package Dropbox;

/**
 * Created by Egor on 05.01.2021.
 */
public class DropboxTask7 {//Написать программу, эмулирующую выдачу случайной карты изколоды в 52 карты. Вывести результат в формате
    private static String[] cardsType0 = {"club", "spade", "heart", "diamond"};
    protected static String[] cardsType1 = {"club", "spade", "heart", "diamond"};
    static String[] cardsType2 = {"club", "spade", "heart", "diamond"};
    public static String[] cardsType3 = {"club", "spade", "heart", "diamond"};

    // "КартаofМасть". Например,"AceofSpades".Валет-Jack,Дама-Queen,Король-King,Туз-Ace,Червы-Hearts,Пики-Spades, Трефы-Clubs,Бубны-Diamonds
    public static void main(String[] args) {
        String[][] result = getOfCards();
        int randomCardsI = (int) (Math.random() * 13);
        int randomCardsJ = (int) (Math.random() * 4);
        System.out.println(result[randomCardsI][randomCardsJ]);

    }

    static String[][] getOfCards() {
        String[] cardsType = {"club", "spade", "heart", "diamond"};
        String[] cardsValue = {"Ace of ", "2 of ", "3 of ", "4 of ", "5 of ", "6 of ", "7 of ", "8 of ", "9 of ", "10 of ", "King of ", "Queen of ", "Jack of "};
        String[][] array = new String[cardsValue.length][cardsType.length];
        for (int i = 0; i < cardsValue.length; i++) {
            for (int j = 0; j < cardsType.length; j++) {
                array[i][j] = cardsValue[i] + cardsType[j];

            }
        }

        return array;
    }

    //todo add method getOfCards that return Array with all cards
}



