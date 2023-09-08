package ru.moskalev.algoritmick_tasks;

import java.util.*;
import java.util.stream.Collectors;

/*B. Недостающее число
ограничение по времени на тест1 секунда
ограничение по памяти на тест256 мегабайт
вводстандартный ввод
выводстандартный вывод
Дан массив из нечётного количества целых чисел. Массив обладает следующим свойством — если дополнить его ещё одним числом,
 все числа в массиве можно будет разбить на пары так, что сумма в каждой паре будет равна нулю.

Скажите, какого числа не хватает в массиве.

Входные данные
В первой строке записано нечётное целое число n
 (1≤n≤99999
). Далее в n
 строках записаны целые числа a1
, ..., an
 — исходный массив (1≤|ai|≤1000
).

Выходные данные
Выведите целое число, которое нужно добавить в массив, чтобы все числа массива разбивались на пары с нулевой суммой. Гарантируется,
 что такое число существует.

Система оценки
В этой задаче две группы тестов.

Первая группа тестов стоит 6 баллов, для неё выполняется ограничение n≤999
.

Вторая группа тестов стоит 4 балла, для неё выполняется ограничение n≤99999

Пример

входные данные
7
1
-2
1
2
3
-1
-1

выходные данные
-3
*/
public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int sizeArray = scanner.nextInt();
            if (sizeArray % 2 == 0) throw new Exception("Введите нечетное число ");
            else {
                int missNum = checkMissingNumber(packArray(scanner, sizeArray));
                System.out.println(missNum);//вывод недостающего числа
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }

    private static int checkMissingNumber(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
      List<Integer> plus=new ArrayList<>();
      List<Integer>minus=new ArrayList<>();
        list.forEach(elem->{
            if(elem>0)plus.add(elem);
            else minus.add(elem);
        });
        return  -(minus.stream().mapToInt(Integer::intValue).sum()+plus.stream().mapToInt(Integer::intValue).sum());
    }

    private static int[] packArray(Scanner scanner, int sizeArray) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            int elemMass = scanner.nextInt();
            array[i] = elemMass;
        }
        return array;
    }
}
