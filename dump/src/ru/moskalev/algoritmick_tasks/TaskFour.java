package ru.moskalev.algoritmick_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*D. Детская площадка
ограничение по времени на тест1 секунда
ограничение по памяти на тест256 мегабайт
вводстандартный ввод
выводстандартный вывод
Дана схема городского квартала в виде прямоугольной таблицы размером n×m
. Каждая ячейка таблицы или принадлежит какому-то зданию, или свободна. Все ячейки по границам квартала заняты зданиями.

Нужно разместить в этом квартале детскую площадку в виде прямоугольника, стороны которого параллельны границам квартала.
 Все ячейки, которые будут отданы под площадку, должны быть свободными. Если есть несколько вариантов размещения площадки,
  нужно выбрать такой, при котором она имеет наибольшую площадь (то есть занимает наибольшее число ячеек таблицы на схеме).

Входные данные
В первой строке записаны целые числа n
 и m
 — размеры таблицы (3≤n,m≤500
). В следующих n
 строках по m
 символов в каждой записана таблица. Свободные ячейки обозначены в ней символами «.», а занятые — символами «*». Гарантируется,
 что первая и последняя строка таблицы, а также первый и последний столбец таблицы заполнены символами «*».

Выходные данные
Выведите наибольшую возможную площадь (количество ячеек) детской площадки. Если в квартале невозможно разместить детскую площадку,
 выведите «0».

Система оценки
В этой задаче три группы тестов.

Первая группа тестов стоит 4 балла, для неё выполняются ограничения n,m≤30
.

Вторая группа тестов стоит 4 балла, для неё выполняются ограничения n,m≤100
.

Третья группа тестов стоит 2 балла, для неё выполняются ограничения n,m≤500
.

Примеры
входные данные
4 10
**********
*...*....*
*...*....*
**********
выходные данные
8
входные данные
3 3
***
***
***
выходные данные
0
*/
public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String sizes = scanner.nextLine();
            String[]numbers=sizes.split(" ");
            int rows=Integer.parseInt(numbers[0]);
            int columns=Integer.parseInt(numbers[1]);
           String map= enterMap(scanner,rows, columns);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }


    private static String  enterMap(Scanner scanner, int rows, int columns) throws Exception {
        StringBuilder sb=new StringBuilder();
        int count=0;
        List<Information>informationList=new ArrayList<>();
        for (int i = 0; i < rows; i++) {
              String s = scanner.nextLine();
              if(i!=0 && i!=rows-1){
                  for (int j = 1; j <columns-1 ; j++) {
                      if(s.charAt(j)=='.'){
                          count++;
                      }
                      else if(s.charAt(j)=='*'){
                         if(count!=0){
                             informationList.add(new Information(i,j,count));
                         }
                          count=0;
                      }
                  }
              }

          //  sb.append(s+"\n");
            if(s.length()!=columns) throw new Exception("количество символов не соответвует введенному знаечнию");
        }
        System.out.println("ok");
        return sb.toString();
    }
    public static class Information{
        int row;
        int column;
        int count;

        public Information(int row, int column, int count) {
            this.row = row;
            this.column = column;
            this.count = count;
        }
    }
}
