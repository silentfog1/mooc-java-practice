import java.util.ArrayList;
import java.util.Scanner;

/**
 * ТЗ:
 * Напишите программу, которая считывает ввод пользователя (String) и добавляет его в список. Как
 * только пользователь вводит пустую строку программа останавливается и выводится последнее
 * считанное значение. Подразумевается что пользователь введет хотя бы одно значение.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();

        while (true) {
            String value = scanner.nextLine();
            if (value.equals("")) {
                break;
            }
            values.add(value);
        }
        System.out.println(values.get(values.size() - 1));

    }
}
