import java.util.ArrayList;
import java.util.Scanner;

/**
 * ТЗ:
 * Напишите программу, которая выводит числа из заданного списка, значения которых находятся в
 * диапазоне [lowerLimit, upperLimit]. Предполагается что пользователь введет хотябы два числа.
 */
public class Main {
    private static final int STOP_SIGNAL = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = readNumbers(scanner);
        System.out.print("Please enter lower limit: ");
        int lowerLimit = Integer.valueOf(scanner.nextLine());
        System.out.print("Please enter upper limit: ");
        int upperLimit = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> filteredNumbers = filterInRange(numbers, lowerLimit, upperLimit);
        printNumbersInRange(filteredNumbers, lowerLimit, upperLimit);

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
    private static ArrayList<Integer> filterInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        ArrayList<Integer> filteredNumbers = new ArrayList<>();
        for (int number: numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }

    private static void printNumbersInRange(ArrayList<Integer> filteredNumbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range " + "[" + lowerLimit + ", " + upperLimit + "]");
        for (int number: filteredNumbers) {
            System.out.println(number);
        }
    }
}