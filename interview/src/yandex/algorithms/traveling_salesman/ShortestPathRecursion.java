package yandex.algorithms.traveling_salesman;

import java.util.ArrayList;
import java.util.List;

public class ShortestPathRecursion {
    // порядковый номер текущего маршрута
    private static int counter = 0;

    // самый короткий путь — сразу ставим заведомо большим, чтобы уменьшать его по мере работы алгоритма
    private static int minPath = 10000;

    // номер самого короткого маршрута
    private static int minCounter;

    // массив для результатов перестановок
    private static final List<List<Integer>> results = new ArrayList<>();

    // номера городов
    private static final List<Integer> cities = List.of(1, 2, 3, 4, 5);

    // самый короткий путь
    private static int path;

    // вспомогательные переменные
    private static int p1, p2;

    public int evaluate(int[][] towns) {
        permute(new ArrayList<>(cities), new ArrayList<>());

        // перебираем все варианты перестановок
        for (int i = 0; i < results.size(); i++) {
            // обнуляем длину текущего маршрута
            path = 0;
            // проходим по каждому городу в текущем варианте пути
            for (int j = 1; j < cities.size(); j++) {
                // достаём очередную пару городов
                // отнимаем единицу, потому что в массиве towns нумерация ячеек начинается с нуля, а не с единицы
                p1 = results.get(i).get(j - 1) - 1;
                p2 = results.get(i).get(j) - 1;

                // прибавляем это к общей длине текущего маршрута
                path = path + towns[p1][p2];
            }

            // если мы нашли маршрут короче, чем был до этого
            if (path < minPath) {
                // запоминаем, какой это номер в перестановках
                minCounter = i;
                // обновляем минимальную длину маршрута
                minPath = path;
            }
        }

        // выводим самый короткий маршрут
        System.out.println(results.get(minCounter));
        return minPath;
    }

    // рекурсивная функция
    // на вход получаем текущий массив и массив с памятью предыдущих вычислений
    private static void permute(List<Integer> arr, List<Integer> memo) {
        // переменная для хранения фрагмента массива
        List<Integer> cur;

        // какой размер входного массива — такой длины и делаем цикл, чтобы перебрать все элементы
        for (int i = 0; i < arr.size(); i++) {
            // получаем новый массив cur, удаляя из входного массива один элемент, начиная с текущей позиции
            // при этом из входного массива этот элемент тоже удалится
            cur = new ArrayList<>(arr.subList(i, i + 1));
            List<Integer> newArr = new ArrayList<>(arr);
            newArr.removeAll(cur);

            // если от входного массива ничего не осталось
            if (newArr.isEmpty()) {
                // то приклеиваем текущее значение нарезки к варианту, который лежит в памяти,
                // и добавляем получившийся результат в итоговый массив
                List<Integer> result = new ArrayList<>(memo);
                result.addAll(cur);
                results.add(result);
            }

            // вызываем новый виток рекурсии
            // в качестве аргументов передаём копию входящего массива и добавляем к кешу памяти то, что получилось после удаления одного символа из входящего массива
            permute(newArr, new ArrayList<>(memo));
            memo.addAll(cur);

            // возвращаем в исходный массив первый элемент из нового массива, но уже на другую позицию
            arr.addAll(i, cur);
        }
    }
}