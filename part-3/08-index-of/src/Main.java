import java.util.ArrayList;
import java.util.Scanner;

/**
 * ТЗ:
 * Напишите программу, которая считывает целые числа от пользователя и добавляет их в список. Как
 * только пользователь вводит -1 программа останавливается и запрашивает у пользователя число и
 * выводит его индекс в списке. Если число не найдено, программа не должна ничего выводить.
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

        System.out.print("Search for? ");
        int number = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < numbers.size(); ++i) {
            if (numbers.get(i) == number) {
                System.out.println(numbers.get(i) + " is at index " + i);
            }
        }
    }
}
