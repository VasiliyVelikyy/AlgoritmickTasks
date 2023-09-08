package coderun.easy;

/*Гвоздики
легкаяdynamic programming 1D
В дощечке в один ряд вбиты гвоздики. Любые два гвоздика можно соединить ниточкой.
Требуется соединить некоторые пары гвоздиков ниточками так, чтобы к каждому гвоздику была привязана хотя бы одна ниточка, а суммарная длина всех ниточек была минимальна.

Формат ввода
В первой строке входных данных записано число N — количество гвоздиков (
2 ≤ n ≤ 100
2≤N≤100). В следующей строке заданы N чисел — координаты всех гвоздиков (неотрицательные целые числа, не превосходящие 10000).

Формат вывода
Выведите единственное число — минимальную суммарную длину всех ниточек.

Пример 1
Ввод
6
3 13 12 4 14 6
Вывод
5
*/

import java.util.*;


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String numbers = scanner.nextLine();
            printAnswer(enterData2(Integer.parseInt(numbers), scanner));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }

    private static void printAnswer(int answer) {
        System.out.println(answer);
    }

    private static int enterData2(int num, Scanner scanner) {
        int[] a = new int[num+1];
        int[] dp = new int[num+1];

        for (int i = 1; i <= num; i++)
            a[i] = scanner.nextInt();

        Arrays.sort(a, 1, num + 1);

        dp[2] = a[2] - a[1];//соединить 2 первых гвоздя
        dp[3] = a[3] - a[1]; //соединить 3 первых гвоздя

        for (int i = 4; i <= num; i++)
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + a[i] - a[i - 1];

       return dp[num];


    }
}
