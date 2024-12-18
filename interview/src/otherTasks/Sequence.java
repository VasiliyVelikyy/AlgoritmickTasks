package otherTasks;

import java.util.HashSet;
import java.util.Set;

/*Как бы Вы написали алгоритм для генерации последовательности случайных неповторяющихся чисел от 1 до 1000 с
использованием функции random(N),
 возвращающей случайное число в диапазоне от 1 до N, и без использования оператора if?*/
class Sequence {
    private static final int MAX_RANGE = 1000;
    private static final int MIN_RANGE = 1;

    public static void main(String[] args) {
        process();
    }

    private static void process() {
        Set<Integer> elems = new HashSet<>();
        boolean start = true;
        while (start) {
            int i = (int) ((Math.random() * (MAX_RANGE + 1 - MIN_RANGE)) + MIN_RANGE);
            elems.add(i);
            if (elems.size() == 1000) {
                start = false;
            }
        }
        elems.stream().sorted().forEach(System.out::println);
    }
}
