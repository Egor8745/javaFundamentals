import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.

    //из getNumberMonth отдавать строку месяца и печатать из main
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int intMonth = Integer.parseInt(reader.readLine());
        String month = getNumberMonth(intMonth);
        System.out.println(month);
    }


    private static String getNumberMonth(int intMonth) {
        if (intMonth < 1 || intMonth > 12) {
            return "Такого месяца не существует";
        }
        String month ;
        switch (intMonth) {
            case 1:
                month = "Январь";
                break;
            case 2:
                month = "Февраль";
                break;
            case 3:
                month = "Март";
                break;
            case 4:
                month = "Апрель";
                break;
            case 5:
                month = "Май";
                break;
            case 6:
                month = "Июнь";
                break;
            case 7:
                month = "Июль";
                break;
            case 8:
                month = "Август";
                break;
            case 9:
                month = "Сентябрь";
                break;
            case 10:
                month = "Октябрь";
                break;
            case 11:
                month = "Ноябрь";
                break;
            case 12:
                month = "Декабрь";
                break;
            default:
                month = "Такого месяца не существует";

        }
        return month;
    }
}



