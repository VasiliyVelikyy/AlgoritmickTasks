package ru.moskalev.algoritmick_tasks;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/*C. Премьер-лига
ограничение по времени на тест1 секунда
ограничение по памяти на тест256 мегабайт
ввод: стандартный ввод
вывод: стандартный вывод
Завершается чемпионат Российской футбольной премьер-лиги. Сыграны все матчи, кроме последнего.
В последнем матче команда A принимает у себя дома команду B. От результата этого матча может зависеть, какое место займёт команда A по итогам
 чемпионата.

Определите, на каком месте закончит чемпионат команда A в случае победы, ничьей или поражения в своём последнем матче.

По правилам футбола, если матч заканчивается победой одной из команд, то победившая команда получает три очка, а проигравшая — ноль очков.
Если матч заканчивается ничьей, то обе команды получают по одному очку. Команды ранжируются в турнирной таблице в порядке убывания набранных
 очков, в случае равенства очков у двух и более команд они ранжируются по алфавиту.

Входные данные
В первой строке записано целое число n
 — количество команд в премьер-лиге (2≤n≤20
). В следующих n
 строках приводится положение команд в турнирной таблице до того, как состоялся последний матч, в формате «название команды» «количество набранных очков».
  Названия команд имеют длину от 3
 до 12
 и состоят только из заглавных латинских букв. Гарантируется, что команды в таблице упорядочены по убыванию количества очков, а при равенстве очков — по алфавиту.
 Названия всех команд различны. Количество очков каждой команды лежит в пределах от 0
 до 99
.

Распределение очков между командами не обязательно описывает ситуацию, возможную в реальности — в рамках данной задачи не нужно обращать внимание на это и
 проверять входные данные на корректность.

В последней строке входных данных написано, какой матч ещё не сыгран. Его описание имеет формат «название команды A»-«название команды B». Названия команд A и B
различны и присутствуют в турнирной таблице.

Выходные данные
Выведите три целых числа через пробел — на каком месте закончит чемпионат команда A в случае победы, ничьей или поражения в матче с командой B.

Система оценки
В этой задаче две группы тестов.

Первая группа тестов стоит 5 баллов, для тестов в ней разница между командами A и B в турнирной таблице превышает три очка.

Вторая группа тестов стоит 5 балла, для тестов в ней разница между командами A и B в турнирной таблице может быть произвольной.

Примеры

входные данные
7
ZENIT 65
SOCHI 56
DINAMO 53
CSKA 50
KRASNODAR 49
LOKOMOTIV 48
AKHMAT 41
KRASNODAR-AKHMAT

выходные данные
4 5 5

входные данные
2
ARGENTINA 5
JAMAICA 0
ARGENTINA-JAMAICA

выходные данные
1 1 1*/
public class TaskThree {

    public static int WIN_POINT = 3;//выйгрыш
    public static int LOSE_POINT = 0;//проигрыш
    public static int DRAW_POINT = 1; //проигрыш

    public static final Comparator<Team> COMPARE_BY_POINT = new Comparator<Team>() {
        @Override
        public int compare(Team a, Team b) {
            int answ = b.getPoint() - a.getPoint();
            if (answ == 0) {
                return a.getName().compareToIgnoreCase(b.getName());
            } else return answ;
        }
    };

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String size = scanner.nextLine();
            List<Team> teams = enterTeam(scanner, Integer.parseInt(size));
            String game = scanner.nextLine();
            String[] twoTeams = game.split("-");
            String teamA = twoTeams[0];
            String teamB = twoTeams[1];


            System.out.println(printPosition(teams, teamA, teamB));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }

    private static String printPosition(List<Team> teams, String teamA, String teamB) {
        int winStr;
        int loseStr;
        int drawStr;
        AtomicReference<Team> winTeam = new AtomicReference<>();
        AtomicReference<Team> loseTeam = new AtomicReference<>();
        AtomicReference<Team> drawTeam = new AtomicReference<>();
        List<Team> winPosition = new ArrayList<>(teams);
        List<Team> losePosition = new ArrayList<>(teams);
        List<Team> drawPosition = new ArrayList<>(teams);

        winPosition.forEach(t -> {
            if (t.getName().equals(teamA)) {
                Team copyA = new Team(t.getName(), t.getPoint());
                copyA.setPoint(t.getPoint() + WIN_POINT);
                winTeam.set(copyA);
                winPosition.set(winPosition.indexOf(t), copyA);
            } else if (t.getName().equals(teamB)) {
                Team copyB = new Team(t.getName(), t.getPoint());
                copyB.setPoint(t.getPoint() + LOSE_POINT);
                winPosition.set(winPosition.indexOf(t), copyB);
            }
        });

        Collections.sort(winPosition, TaskThree.COMPARE_BY_POINT);
        winStr = 1 + winPosition.indexOf(winTeam.get());

        losePosition.forEach(t -> {
            if (t.getName().equals(teamA)) {
                Team copyA = new Team(t.getName(), t.getPoint());
                copyA.setPoint(t.getPoint() + LOSE_POINT);
                loseTeam.set(copyA);
                losePosition.set(losePosition.indexOf(t), copyA);

            } else if (t.getName().equals(teamB)) {
                Team copyB = new Team(t.getName(), t.getPoint());
                copyB.setPoint(t.getPoint() + WIN_POINT);
                losePosition.set(losePosition.indexOf(t), copyB);
            }
        });
        Collections.sort(losePosition, TaskThree.COMPARE_BY_POINT);
        loseStr = 1 + losePosition.indexOf(loseTeam.get());

        drawPosition.forEach(t -> {
            if (t.getName().equals(teamA)) {
                Team copyA = new Team(t.getName(), t.getPoint());
                copyA.setPoint(t.getPoint() + DRAW_POINT);
                drawTeam.set(copyA);
                drawPosition.set(drawPosition.indexOf(t), copyA);

            }
            if (t.getName().equals(teamB)) {
                Team copyB = new Team(t.getName(), t.getPoint());
                copyB.setPoint(t.getPoint() + DRAW_POINT);
                drawPosition.set(drawPosition.indexOf(t), copyB);
            }
        });

        Collections.sort(drawPosition, TaskThree.COMPARE_BY_POINT);
        drawStr = 1 + drawPosition.indexOf(drawTeam.get());

        return winStr + " " + drawStr + " " + loseStr;
    }

    private static List<Team> enterTeam(Scanner scanner, int size) throws Exception {
        List<Team> teams = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            String enterStr = scanner.nextLine();
            String[] nameAndPoint = enterStr.split(" ");
            String teamName = nameAndPoint[0];
            String teamPoint = nameAndPoint[1];
            if (teamName.length() > 12 && teamName.length() < 3)
                throw new Exception("Имя команды должно быть больше 3 и меньше 12 символов");
            else teams.add(new Team(teamName, Integer.parseInt(teamPoint)));
        }
        return teams;
    }

    public static class Team {
        String name;
        int point;

        public Team(String name, int point) {
            this.name = name;
            this.point = point;
        }

        public String getName() {
            return name;
        }

        public int getPoint() {
            return point;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPoint(int point) {
            this.point = point;
        }


    }
}
