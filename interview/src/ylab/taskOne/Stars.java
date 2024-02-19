package ylab.taskOne;

//Задание 1:
//  Stars. Программе передается 3 параметра: количество строк, количество столбцов, произвольный симов.
//  Необходимо вывести вывести фигуру, состоящую из заданного списка строк и заданного количества столбцов,
//  и каждый элемент в которой равен указанному символу.
//
// Ввод: n m c
// Вывод: фигура
//
// Пример:
// Ввод:
// 2 3 $

import java.util.Scanner;

// Вывод:
// $ $ $
// $ $ $
public class Stars {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        //если нужно добавить повторение вывода без перезапуска программы,
        // нужно добавить while(true) над try а scanner вынести из try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите: \n1 число-количество строк \n2 число - количество столбцов\n3 строку- символ который будет выводиться");
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String template = scanner.next();
            printFigure(n, m, template);
        } catch (Exception e) {
            System.out.println("Возможно вы ввели строку вместо числа. Попробуйте еще раз");
        }
    }

    public static void printFigure(int rows, int columns, String symbol) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
