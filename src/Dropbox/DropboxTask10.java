package Dropbox;

/**
 * Created by Егор on 16.01.2021.
 */
public class DropboxTask10 {
    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }
}
