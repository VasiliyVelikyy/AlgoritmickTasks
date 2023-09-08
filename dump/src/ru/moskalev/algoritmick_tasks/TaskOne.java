package ru.moskalev.algoritmick_tasks;

import java.util.*;

/*A. Индусская математика
ограничение по времени на тест1 секунда
ограничение по памяти на тест256 мегабайт
вводстандартный ввод
выводстандартный вывод
Пусть задано число x
, десятичная запись которого не содержит нулей. Рассмотрим все числа, которые можно получить из числа x
 перестановкой его цифр. Пусть M
 — наибольшее из таких чисел, а m
 — наименьшее. Определим число K(x)
 как M−m
.

Например, для x=6174
 получаем M=7641
, m=1467
, K(x)=7641−1467=6174
.

Вычислите K(x)
 по заданному числу x
.

Входные данные
В единственной строке записано целое число x
 (1≤x≤109−1
). Десятичная запись x
 не содержит нулей.

Выходные данные
Выведите целое число K(x)
.

Система оценки
В этой задаче одна группа тестов стоимостью 10 баллов.

Пример
входные данные
6174

выходные данные
6174*/
public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                list.add(Character.getNumericValue(s.charAt(i)));
            }
            Collections.sort(list);
            StringBuilder strB = new StringBuilder();
            list.forEach(num -> {
                strB.append(Integer.toString(num));
            });
            String min = strB.toString();
            String max = strB.reverse().toString();

            System.out.println(Integer.parseInt(max) - Integer.parseInt(min));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }


    }
}
