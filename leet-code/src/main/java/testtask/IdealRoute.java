package testtask;

import java.util.Scanner;

/*Эффективные погрузчики
Нет ответа
27 апр. 21:10
 	Все языки	Python 3.12.3
Ограничение времени	1 секунда	15 секунд
Ограничение памяти	64 Мб	64 Мб
Ввод	стандартный ввод
Вывод	стандартный вывод
На крупном заводе решили проверить эффективность работы погрузчиков и провели эксперимент: установили на складах датчики iBeacon и отслеживали перемещение погрузчиков между различными зонами.

Каждая зона склада обозначается уникальным целым числом. Когда погрузчик перемещается из одной зоны в другую, система регистрирует номер новой зоны, в которую он въехал. В результате движение каждого погрузчика представлено в виде последовательности чисел.

Инженеры завода считают, что наиболее эффективный путь, который может совершить погрузчик, — это поездка из некоторой начальной зоны в конечную, а затем возвращение по тому же маршруту обратно. Такая последовательность перемещений формирует так называемый «идеальный маршрут».

Вам необходимо найти длину самого длинного «идеального маршрута» в записи перемещений погрузчика.

Формат ввода
Первая строка содержит одно целое число n (1 ≤ n ≤ 1 0 4 10^410
4
 ) — количество записей о перемещениях погрузчика.

Вторая строка содержит n целых чисел a₁, a₂, ..., aₙ (1 ≤ aᵢ ≤ 1 0 9 10^910
9
 ) — последовательность зон, через которые проехал погрузчик.

Формат вывода
Выведите одно целое число — длину самого длинного «идеального маршрута» в записи перемещений. Если такого маршрута не существует, выведите 0.


Пример 1
Ввод	Вывод
7
1 2 3 4 3 2 1
7
Пример 2
Ввод	Вывод
5
1 2 3 4 5
0
Пример 3
Ввод	Вывод
10
1 2 3 4 5 5 4 3 2 1
10
Пример 4
Ввод	Вывод
6
1 2 3 1 2 3
0
Пример 5
Ввод	Вывод
3
1 1 2
2

*/
public class IdealRoute {
    public static void main(String[] args) {
        IdealRoute solution = new IdealRoute();

        int[] a = solution.enterMass();

        int answer = solution.evaluate(a.length, a);

        System.out.println(answer);
    }

    private int[] enterMass() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        scanner.close();
        return a;

    }
    public int evaluate(int n, int[] a) {
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int left = i, right = i;
            while (left >= 0 && right < n && a[left] == a[right]) {
                int currentLength = right - left + 1;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                left--;
                right++;
            }


            left = i;
            right = i + 1;
            while (left >= 0 && right < n && a[left] == a[right]) {
                int currentLength = right - left + 1;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                left--;
                right++;
            }
        }

        return maxLength >= 2 ? maxLength : 0;
    }


//    public int evaluate(int n, int[] a) {
//        int maxLength = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (a[i] == a[j]) {
//
//                    boolean isPalindrome = true;
//                    int left = i + 1;
//                    int right = j - 1;
//                    while (left <= right) {
//                        if (a[left] != a[right]) {
//                            isPalindrome = false;
//                            break;
//                        }
//                        left++;
//                        right--;
//                    }
//                    if (isPalindrome) {
//                        int currentLength = j - i + 1;
//                        if (currentLength > maxLength) {
//                            maxLength = currentLength;
//                        }
//                    }
//                }
//            }
//        }
//        return maxLength;
//    }

//    public int evaluate(int n, int[] a) {
//        int maxLength = 0;
//
//        // Перебираем все возможные начала и концы подмассивов
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (a[i] == a[j]) { // Нашли возможные границы палиндрома
//                    // Проверяем, является ли подмассив a[i..j] палиндромом
//                    boolean isPalindrome = true;
//                    int left = i + 1; // Следующий элемент после начала
//                    int right = j - 1; // Предыдущий элемент перед концом
//
//                    // Сравниваем элементы, двигаясь к центру
//                    while (left < right) {
//                        if (a[left] != a[right]) {
//                            isPalindrome = false;
//                            break;
//                        }
//                        left++;
//                        right--;
//                    }
//
//                    // Если палиндром найден, обновляем максимальную длину
//                    if (isPalindrome) {
//                        int currentLength = j - i + 1;
//                        maxLength = Math.max(maxLength, currentLength);
//                    }
//
//                }
//            }
//        }
//        return maxLength;
//
//    }

}
