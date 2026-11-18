import java.util.ArrayList;
import java.util.Scanner;

/**
 * ТЗ:
 * Напишите программу, которая считывает целые числа от пользователя и добавляет их в список. Как
 * только пользователь вводит -1 программа останавливается и выводится все числа из списка.
 * Подразумевается что пользователь введет хотя бы одно значение.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }

        for (int i = 0; i < numbers.size(); ++i) {
            System.out.println(numbers.get(i));
        }
    }
}
