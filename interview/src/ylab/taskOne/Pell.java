package ylab.taskOne;

import java.util.Scanner;

//Pell numbers Числа Пелля задаются следующим соотношением:
//
//На вход подается число n (0 <= n <= 30), необходимо распечатать n-e число Пелля
//Пример:
//Ввод:
//5
//Вывод:
//29
public class Pell {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число от 0 до 30");
            int n = scanner.nextInt();
            evaluatePellNumber(n);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Вы ввели число меньше 0 или больше 30. Попробуйте еще раз");
        }
    }

    private static void evaluatePellNumber(int num) throws Exception {
        if (num < 0 || num > 30) throw new Exception();

        long result = 0;
        long p = 1;
        long ordinalNumber;
        for (int i = 1; i <= num; i++) {
            ordinalNumber = p + 2 * result;
            p = result;
            result = ordinalNumber;
        }
        System.out.println(result);
    }
}
