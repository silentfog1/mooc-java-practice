import java.util.ArrayList;
import java.util.Scanner;

/**
 * ТЗ:
 * Напишите программу, которая считывает ввод пользователя  до тех пор, пока не будет введена
 * пустая строка. Добавьте в неё следующую функциональность: после считывания ввода у пользователя
 * запрашивается ещё одна строка. Затем программа сообщает, была ли эта строка найдена в списке или
 * нет.
 */
public class Main {
    private static final String STOP_SIGNAL = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> stringsFromUser = readStrings(scanner);

        System.out.print("Search for? ");
        String targetString = scanner.nextLine();
        boolean searchResult = containsString(stringsFromUser, targetString);
        if (searchResult) {
            System.out.println(targetString + " was found!");
        } else {
            System.out.println(targetString + " was not found!");
        }
    }

    private static ArrayList<String> readStrings (Scanner scanner) {
        ArrayList<String> stringsFromUser = new ArrayList<>();
        while (true) {
            String stringFromUser = scanner.nextLine();
            if (stringFromUser.equals(STOP_SIGNAL)) {
                return stringsFromUser;
            }
            stringsFromUser.add(stringFromUser);
        }
    }

    private static boolean containsString (ArrayList<String> stringsFromUser, String targetString) {
        for (String stringFromUser: stringsFromUser) {
            if (stringFromUser.equals(targetString)) {
                return true;
            }
        }
        return false;
    }
}
