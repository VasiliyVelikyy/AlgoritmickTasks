package training.easy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*1. Простая задача

Введите двузначное число и выведите через пробел каждую цифру отдельно.
Вход. Одно натуральное число из промежутка от 10 до 99 включительно.

Выход. Выведите через пробел две цифры числа.

Пример входа
23
Пример выхода
2 3
*/
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String numbers = scanner.nextLine();
            printAnswer(numbers);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }

    private static void printAnswer(String numbers) {
        String[] elems = new String[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            elems[i] = String.valueOf(numbers.charAt(i));
        }
        String answer = Arrays.asList(elems).stream().collect(Collectors.joining(" "));
        System.out.println(answer);
    }

}
