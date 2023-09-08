package code_forces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*B. Электронные таблицы
ограничение по времени на тест10 seconds
ограничение по памяти на тест64 megabytes
вводстандартный ввод
выводстандартный вывод
В популярных системах электронных таблиц (например, в программе Excel) используется следующая нумерация колонок. Первая колонка имеет номер A, вторая
 B и т.д. до 26-ой, которая обозначается буквой Z. Затем идут двухбуквенные обозначения: 27-ая обозначается как AA, 28-ая как AB, а 52-я обозначается парой AZ.
 Аналогично, следом за ZZ следуют трехбуквенные обозначения и т.д.

Строки обычно обозначаются целыми числами от 1. Номер ячейки получается конкатенацией обозначений для столбца и строки. Например, BC23 это обозначение для ячейки в
столбце 55, строке 23.

Иногда используется другая форма записи: RXCY, где X и Y это целые числа, обозначающие номер строки и столбца, соответственно. Например, R23C55 это ячейка из примера выше.

Ваша задача написать программу, которая считывает последовательность обозначений ячеек и выводит каждое из обозначений в другой форме записи.

Входные данные
В первой строке записано целое число n (1 ≤ n ≤ 105), количество обозначений в тесте. Далее идет n строк, каждая из которых содержит обозначение. Известно, что все
 обозначения корректны, и не содержат ячейки с номерами строк или столбцов больших 106.

Выходные данные
Выведите n строк — каждая строка должна содержать обозначение ячейки в отличной форме записи.

Примеры
входные данные
2
R23C55
BC23
выходные данные
BC23
R23C55*/
public class SpreadSheets {
    private static final String MASK_ONE = "R\\d{2}C\\d{2}";
    private static final String MASK_TWO = "\\d{1,}";
    private static final int ORDER_CONST=26;
    private static final List<String> LETTERS = Arrays.asList("A", "B", "C", "D", "E", "F", "J", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String count = scanner.nextLine();
            enterCoordinates(scanner, Integer.parseInt(count));

            //System.out.println(answer);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }

    }

    private static void enterCoordinates(Scanner scanner, int count) {
        List<String> coordinates = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            coordinates.add(line);
        }

        convertCoordinates(coordinates);
    }

    private static void convertCoordinates(List<String> coordinates) {
        List<Integer> mass = new ArrayList();
        StringBuilder sb=new StringBuilder();
        coordinates.forEach(elem -> {
            Pattern pattern1 = Pattern.compile(MASK_ONE);
            Matcher mask = pattern1.matcher(elem);
            if (mask.find()) {
                Pattern pattern2 = Pattern.compile(MASK_TWO);
                Matcher values = pattern2.matcher(elem);
                while (values.find()) {
                    mass.add(Integer.parseInt(values.group()));
                }
                int row = mass.get(0);
                int column = mass.get(1);
                int order =(int) Math.ceil((double) column/ORDER_CONST);
                if(order>1){
                  int postitionlastLetter  =(column-ORDER_CONST*(order-1))-1;
                    sb.append(LETTERS.get(postitionlastLetter));
                }

            }
        });
    }
}
