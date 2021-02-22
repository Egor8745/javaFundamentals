package Dropbox;

import sun.security.util.ArrayUtil;

/**
 * Created by Егор on 04.02.2021.
 */
public class ArrayHomeWork2 {//Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат

    public static void main(String[] args) throws java.lang.Exception {
        int[] a = new int[10];
        int n = a.length;
        System.out.println("Исходный массив: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i] + " ");
        }
        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (a[j] != a[i]) {
                    if (m != j) a[m] = a[j];
                    m++;
                }
            }
        }
        if (n != a.length) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = a[i];

            a = b;
        }
        System.out.println();
        System.out.println("Массив после изменения ");
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
    }
}



