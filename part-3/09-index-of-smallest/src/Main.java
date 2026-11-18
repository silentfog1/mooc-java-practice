import java.util.ArrayList;
import java.util.Scanner;

/**
 * ТЗ:
 * Напишите программу, которая считывает целые числа от пользователя и добавляет их в список. Как
 * только пользователь вводит 9999 программа останавливается и выводит наименьшее число в списке,
 * а также индексы, по которым это число встречается. Обратите внимание: наименьшее число может
 * встречаться в списке несколько раз.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // fill in the list
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            numbers.add(number);
        }

        // search for smallest
        int smallestNumber = numbers.get(0);
        for (int i = 0; i < numbers.size(); ++i) {
            if (numbers.get(i) < smallestNumber) {
                smallestNumber = numbers.get(i);
            }
        }
        System.out.println("Smallest number: " + smallestNumber);

        // search for the smallest's index
        for (int i = 0; i < numbers.size(); ++i) {
            if (numbers.get(i) == smallestNumber) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
