package Dropbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Егор on 15.01.2021.
 */
public class DropboxTask9 {//Имеется целое число, определить является ли это число простым,т.е. делится без остатка только на 1 и себя.

    public static void main(String[] args) throws IOException {
        int temp;
        boolean isPrime = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        // если переменная isPrime равна true, то число простое
        if (isPrime) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - составное число");
        }
    }
}

