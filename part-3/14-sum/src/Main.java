import java.util.ArrayList;
import java.util.Scanner;

/**
 * ТЗ:
 * Напишите программу, которая выводит сумму чисел находящихся в списке.
 * Предполагается что пользователь введет хотябы два числа.
 */
public class Main {
    private static final int STOP_SIGNAL = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = readNumbers(scanner);
        int sumOfNumbers = calculateSum(numbers);
        System.out.println(sumOfNumbers);

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

    private static int calculateSum(ArrayList<Integer> numbers) {
        int sumOfNumbers = 0;
        for (int num: numbers) {
            sumOfNumbers += num;
        }
        return sumOfNumbers;
    }
}