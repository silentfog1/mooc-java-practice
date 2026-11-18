import java.util.ArrayList;
import java.util.Scanner;

/**
 * ТЗ:
 * Напишите программу, которая считывает целые числа от пользователя и добавляет их в список. Как
 * только пользователь вводит -1 программа останавливается и выводит найбольшее число в списке.
 * Подразумевается что пользователь введет хотябы одно число.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int greatestNumber = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                greatestNumber = numbers.get(0);
                for (int i = 0; i < numbers.size(); ++i) {
                    if (numbers.get(i) > greatestNumber) {
                        greatestNumber = numbers.get(i);
                    }
                }
                break;
            }
            numbers.add(number);
        }

        System.out.println("The greatest number: " + greatestNumber);
    }
}
