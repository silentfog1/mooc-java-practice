import java.util.ArrayList;
import java.util.Scanner;

/**
 * ТЗ:
 * Напишите программу, которая считывает целые числа от пользователя и добавляет их в список. Как
 * только пользователь вводит -1 программа останавливается и среднее арифметическое чисел всего
 * списка.
 * Подразумевается что пользователь введет хотя бы одно число и не будет вводить ноль.
 */
public class Main {
    private static final int STOP_SIGNAL = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Метод сам создает и возвращает заполненную коллекцию
        ArrayList<Integer> numbers = readNumbers(scanner);

        double average = averageOfList(numbers);
        System.out.println("Average: " + average);

        scanner.close(); // Корректно закрываем системный поток в конце работы main
    }

    private static ArrayList<Integer> readNumbers(Scanner scanner) {
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == STOP_SIGNAL) {
                break;
            }
            numbers.add(number);
        }

        return numbers;
    }

    private static double averageOfList(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size();

        return average;
    }
}
