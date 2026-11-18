import java.util.ArrayList;
import java.util.Scanner;

/**
 * ТЗ:
 * Программа считывает целые числа от пользователя и добавляет их в список. Ввод прекращается,
 * когда пользователь вводит число -1. После этого программа запрашивает начальный и конечный
 * индексы, а затем выводит все числа из списка, которые попадают в этот диапазон (включительно).
 * Можно предполагать, что пользователь введет корректные индексы, существующие в списке.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int fromWhere = 0;
        int toWhere = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.print("From where? ");
                fromWhere = Integer.valueOf(scanner.nextLine());
                System.out.print("To where? ");
                toWhere = Integer.valueOf(scanner.nextLine());
                break;
            }
            numbers.add(number);
        }

        for (int i = fromWhere; i <= toWhere; ++i) {
            System.out.println(numbers.get(i));
        }
    }
}
