package testtask;


import java.util.*;

/*Робот на севере
Нет ответа
27 апр. 23:42
Ограничение времени	4 секунды
Ограничение памяти	256 Мб
Ввод	стандартный ввод
Вывод	стандартный вывод
В одном северном городе погодные условия насколько суровы, что иногда выйти на улицу даже в магазин у дома практически невозможно, поэтому было решено запустить специальных роботов, которые доставляли бы жителям продукты во время метелей, ураганов и просто экстремальных температур.

Каждый робот начинает свой путь из определённой точки загрузки, развозит продукты по нескольким адресам и возвращается на базу для перезарядки, после чего снова отправляется на выполнение задач.

О каждом перемещении между адресами робот отчитывается отправкой сообщения на сервер, однако из-за проблем с сетью эти посылки приходят в вразнобой и на сервере теряется правильная очерёдность...

По полученным данным вам необходимо определить, по какому адресу робот был загружен для выполнения доставки и где закончил свой путь.

Формат ввода
В первой строке содержится число n nn — количество перемещений робота. В следующих n nn строках содержится информация о каждом перемещении.

Любое перемещение описывается парой адресов: откуда и куда, — сами же адреса состоят из названия улицы (a i a_ia
i
​
 ) и номера дома (h i h_ih
i
​
 ), разделённых пробелом.

Название улицы (a i a_ia
i
​
 ) состоит из одного слова, содержащего не более 16 1616 символов, и включает только буквы английского алфавита (как в верхнем, так и в нижнем регистре).

1 ≤ h i ≤ 2000 1 \leq h_i \leq 20001≤h
i
​
 ≤2000, 1 ≤ n ≤ 500000 1 \leq n \leq 5000001≤n≤500000

Формат вывода
Пара адресов: точка старта и точка конца маршрута, разделённые пробелом.

Если точно определить необходимую информацию невозможно, выведите − 1 -1−1.

Пример 1
Ввод	Вывод
1
Lenina 10 Storozhevaya 25
Lenina 10 Storozhevaya 25
Пример 2
Ввод	Вывод
2
Frunze 19 Dybenko 22
Dybenko 22 Frunze 19
-1
Пример 3
Ввод	Вывод
3
Dozhdevaya 15 LvaTolstogo 16
Lenina 2 Dozhdevaya 15
LvaTolstogo 16 Kosmonavtov 4
Lenina 2 Kosmonavtov 4*/
public class RobotInServers {

    //other solution
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Для хранения разницы между исходящими и входящими перемещениями
        Map<String, Integer> addressCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String fromStreet = parts[0];
            int fromHouse = Integer.parseInt(parts[1]);
            String toStreet = parts[2];
            int toHouse = Integer.parseInt(parts[3]);

            String fromAddress = fromStreet + " " + fromHouse;
            String toAddress = toStreet + " " + toHouse;

            // Уменьшаем счетчик для адреса отправления
            addressCount.put(fromAddress, addressCount.getOrDefault(fromAddress, 0) - 1);
            // Увеличиваем счетчик для адреса назначения
            addressCount.put(toAddress, addressCount.getOrDefault(toAddress, 0) + 1);
        }

        // Находим адреса с нечетным счетчиком
        String start = null;
        String end = null;
        int count = 0;

        for (Map.Entry<String, Integer> entry : addressCount.entrySet()) {
            if (entry.getValue() == -1) {
                start = entry.getKey();
                count++;
            } else if (entry.getValue() == 1) {
                end = entry.getKey();
                count++;
            }
        }

        // Проверяем, что нашли ровно две точки (начало и конец)
        if (count == 2 && start != null && end != null) {
            System.out.println(start + " " + end);
        } else {
            System.out.println(-1);
        }
    }





//    public static void main(String[] args) {
//        RobotInServers solution = new RobotInServers();
//        String[] values = solution.enterValues();
//
//        String answer = solution.valuateWithSplit(values);
//        System.out.println(answer);
//    }
//
//
//    public String valuateWithSplit(String[] values) {
//        String[] newStr = Arrays.stream(values)
//                .flatMap(val -> Arrays.stream(val.split(" ")))
//                .filter(s -> !s.isEmpty())
//                .toArray(String[]::new);
//        return evaluate(newStr);
//    }
//
//    public String evaluate(String[] values) {
//        Map<String, Integer> map = new LinkedHashMap<>();
//
//        for (int i = 0, j = 1; i < values.length && j < values.length; i = i + 2, j = j + 2) {
//            String address = values[i];
//            String domNum = values[j];
//            String all = address + " " + domNum;
//            map.put(all, map.getOrDefault(all, 0) + 1);
//
//        }
//
//        String start = null;
//        String end;
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) {
//
//                if (start == null) {
//                    start = entry.getKey();
//                } else {
//                    end = entry.getKey();
//                    return start + " " + end;
//                }
//            }
//        }
//        return "-1";
//    }
//
//    private String[] enterValues() {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        String[] strings = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            strings[i] = scanner.nextLine();
//        }
//        return strings;
//    }

}
