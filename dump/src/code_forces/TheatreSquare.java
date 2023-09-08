package code_forces;

import java.util.Scanner;

/*A. Театральная площадь
ограничение по времени на тест1 second
ограничение по памяти на тест256 megabytes
вводстандартный ввод
выводстандартный вывод
Театральная площадь в столице Берляндии представляет собой прямоугольник n × m метров.
По случаю очередного юбилея города, было принято решение о замощении площади квадратными
гранитными плитами. Каждая плита имеет размер a × a.

Какое наименьшее количество плит понадобится для замощения площади?
Разрешено покрыть плитами большую поверхность, чем театральная площадь,
 но она должна быть покрыта обязательно. Гранитные плиты нельзя ломать или дробить,
 а разрешено использовать только целиком. Границы плит должны быть параллельны границам площади.

Входные данные
В первой строке записано три целых натуральных числа n, m и a (1 ≤ n, m, a ≤ 109).

Выходные данные
Выведите искомое количество плит.

Примеры
входные данныеСкопировать
6 6 4
выходные данныеСкопировать
4*/
public class TheatreSquare {

    public static void main(String[] args) {
            Scanner scanner = null;
            try {
                scanner = new Scanner(System.in);
                String params = scanner.nextLine();
                String[] numbers = params.split(" ");
                long a = Integer.parseInt(numbers[0]); //сторона а
                long b = Integer.parseInt(numbers[1]);//сторона б
                long plate = Integer.parseInt(numbers[2]); //размер одной стороны квадрата
                long answer = evaluateSquare2(a, b, plate);

                System.out.println(answer);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (scanner != null)
                    scanner.close();
            }

    }
    //решение в 1 строчку
    private static long evaluateSquare2(long a, long b, long plate) {
        return (long) (Math.ceil((double) a/plate)*Math.ceil((double)b/plate));
    }
    private static long evaluateSquare(long a, long b, long plate) {
        long column = 0;
        long row = 0;
        long count = 0;
        if (plate == 1) return a * b; //если плита имеет мин значение -сразу вернуть результат
        while (a > 0) {
            a -= plate;
            column++; //количество квадратов по стороне а
        }
        while (b > 0) {
            b -= plate;
            row++; //количество квадратов по стороне б
        }
        for (int i = 0; i < column; i++) { // иду по столбцам прибавляя количество квадратов в строке
            count += row;
        }
        return count;
    }
}
