import java.util.ArrayList;
import java.util.Scanner;

/**
 * ТЗ:
 * Реализуйте программу, которая запрашивает у пользователя имена и добавляет их в список (ArrayList).
 * Программа останавливается, когда пользователь вводит пустую строку, и следом выводится третье
 * значение из списка. Подразумевается, что меньше трех значений пользователь вводить не будет.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) { // Вообще правильно использовать isEmpty но я использовал просто
                                  // пустую строку так как isEmpty ещё в курсе не изучался.
                break;
            }
            names.add(name);
        }

        System.out.println(names.get(2));
    }
}

/* Это мой код!!!
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String name;

        while (true) {
            name = scan.nextLine();
            if (name.equals("")) {
                break;
            }
            names.add(name);
        }

        System.out.println(names.get(2));
    }
}

/*
Реализуйте программу которая запрашивает у пользователя имена и добавляет их в список (ArrayList). Программа
останавливается, когда пользователь вводит пустую строку и следом выводится третье значение из списка. Подразумевается
что меньше трех значений пользователь вводить не будет.
 */