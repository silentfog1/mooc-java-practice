import java.util.ArrayList;
import java.util.Scanner;

/**
 * ТЗ:
 * Напишите программу, которая считывает целые числа от пользователя и добавляет
 * их в список. Если пользователь вводит цифру 0, то программа завершается.
 * После этого программа выводит сумму второго и третьего значения из списка.
 * Подразумевается, что меньше трех значений пользователь вводить не будет.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            numbers.add(number);
        }

        System.out.println("Sum: " + (numbers.get(1) + numbers.get(2)));
    }
}

/*
import java.util.ArrayList;
import java.util.Scanner;


/**
 * ТЗ:
 * Напишите программу, которая считывает целые числа от пользователя и добавляет их в список. Если
 * пользователь вводит цифру 0 то программа завершается. После этого программа выводит сумму второго
 * и третъего значения из списка. Подразумевается, что меньше трех значений пользователь вводить
 * не будет.
 *


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            numbers.add(number);
        }
        System.out.println("Sum: " + (numbers.get(1) + numbers.get(2)));
    }
}

*/
