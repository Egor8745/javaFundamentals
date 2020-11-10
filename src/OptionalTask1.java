import java.util.Scanner;

public class OptionalTask1 {// Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
                            // самое короткое (самое большое число). Самое длинное (самое маленькое)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int maxNumber = 0;
        int minNumber = 0;
        String[] strings = line.split(" ");
        for (int i = 0; i < strings.length; i++) {
            int currentInt = Integer.parseInt(strings[i]);
            int numberLength = getNumberLength(currentInt);
            if (i == 0 || numberLength > getNumberLength(maxNumber)) {
                maxNumber = currentInt;
            }
            if (i == 0 || numberLength < getNumberLength(minNumber)) {
                minNumber = currentInt;
            }
        }
        System.out.println("Самое длинное число: '" + maxNumber + "'");
        System.out.println("Длина: " + getNumberLength(maxNumber));
        System.out.println("Самое короткое число: '" + minNumber + "'");
        System.out.println("Длина: " + getNumberLength(minNumber));
    }

    private static int getNumberLength(int number) {
        int length = 1;
        while (true) {
            number = number / 10;
            if (number == 0) {
                break;
            } else {
                length++;
            }
        }
        return length;
    }
}

