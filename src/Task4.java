import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Task4 {  // Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        System.out.println("Результат Умножения = " + x * y);
    }
}
