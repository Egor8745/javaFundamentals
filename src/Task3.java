import java.util.Random;

public class Task3 {       //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        int dif = max - min;
        Random random = new Random();
        int i = random.nextInt(dif + 1);
        int x = random.nextInt(dif + 1);
        i += min;
        x += min;
        System.out.println(i + " " + x);
    }
}
