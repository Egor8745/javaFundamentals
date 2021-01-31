package Dropbox;


/**
 * Created by Egor on 11.01.2021.
 */
public class DropboxTask8 {
    public static void main(String[] args) {
        DropboxTask7.getOfCards();
        String[][] array = DropboxTask7.getOfCards();
        shuffleTheDeck(array);
    }

    protected static void shuffleTheDeck(String[][] shuffle) {
        for (int i = 0; i < shuffle.length; i++) {
            for (int j = 0; j < shuffle[i].length; j++) {
                int randomIndex1 = (int) (Math.random() * 13);
                int randomIndex2 = (int) (Math.random() * 4);
                String rnd = shuffle[i][j];
                shuffle[i][j] = shuffle[randomIndex1][randomIndex2];
                shuffle[randomIndex1][randomIndex2] = rnd;
            }
        }
        for (int i = 0; i < shuffle.length; i++) {
            for (int j = 0; j < shuffle[i].length; j++) {
                System.out.println(shuffle[i][j]);
            }
        }
    }

}


