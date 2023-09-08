package yandex.summerschool;

import java.util.*;

public class Task1 {
    public static final String GET_MIN = "GETMIN";
    public static final String GET_MAX = "GETMAX";
    public static final String RESET = "RESET";
    public static final String DISABLE = "DISABLE";

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String enterData = scanner.nextLine();
            String[] datas = enterData.split(" ");
            String dataCenters = datas[0];
            String servers = datas[1];
            String events = datas[2];
            checkEvents(Integer.parseInt(dataCenters), Integer.parseInt(servers), Integer.parseInt(events), scanner);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }

    private static void checkEvents(int dataCenters, int servers, int events, Scanner scanner) {

        List<List<Integer>> data = new ArrayList<>(dataCenters);
        Map<Integer, Integer> resetCount = new HashMap<>();

        enableAllServers(data, resetCount, servers, dataCenters);

        pushEvent(data, resetCount, events, scanner);


    }

    private static void enableAllServers(List<List<Integer>> data, Map<Integer, Integer> resetCount, int servers, int dataCenters) {
        for (int i = 0; i < dataCenters; i++) {
            ArrayList<Integer> center = new ArrayList<>(servers);
            for (int j = 0; j < servers; j++) {
                center.add(1);
            }
            data.add(center);
            resetCount.put(i, 0);
        }
    }

    private static void pushEvent(List<List<Integer>> data, Map<Integer, Integer> resetCount, int events, Scanner scanner) {
        List<String> finalAnswer = new ArrayList<>();
        for (int i = 0; i < events; i++) {
            String enterData = scanner.nextLine();
            if (enterData.equals(GET_MAX)) {
                getMaxCenter(data, resetCount, finalAnswer);
            } else if (enterData.equals(GET_MIN)) {
                getMinCenter(data, resetCount, finalAnswer);
            } else if (enterData.contains(RESET)) {
                String[] parts = enterData.split(" ");
                int numOfCenter = Integer.parseInt(parts[1]) - 1; //уменьшаю на единицу тк в листе индексы начинаются с нуля
                for (int j = 0; j < data.get(numOfCenter).size(); j++) {
                    data.get(numOfCenter).set(j, 1); //включить все сервера в опр датацентре
                }
                int count = resetCount.get(numOfCenter) + 1;
                resetCount.put(numOfCenter, count);
            } else if (enterData.contains(DISABLE)) {
                String[] parts = enterData.split(" ");
                String event = parts[0];
                int numOfCenter = Integer.parseInt(parts[1]) - 1; //уменьшаю на единицу тк в листе индексы начинаются с нуля
                int numOfServer = Integer.parseInt(parts[2]) - 1;
                data.get(numOfCenter).set(numOfServer, 0);//выключить нужный сервер
            }
        }
        finalAnswer.forEach(answ -> {
            System.out.println(answ);
        });

    }


    private static void getMaxCenter(List<List<Integer>> data, Map<Integer, Integer> resetCount, List<String> finalAnswer) {
        List<Integer> values = new ArrayList<>(resetCount.size());
        resetCount.forEach((key, value) -> {
            int RA = value * data.get(key).stream().mapToInt(i->i).sum();
            values.add(key, RA);
        });

        int indexOfMax = 0;
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) > values.get(indexOfMax)) {
                indexOfMax = i;
            }
        }
        finalAnswer.add(String.valueOf(indexOfMax + 1));
    }

    private static void getMinCenter(List<List<Integer>> data, Map<Integer, Integer> resetCount, List<String> finalAnswer) {
        List<Integer> values = new ArrayList<>(resetCount.size());
        resetCount.forEach((key, value) -> {
            int RA = value * data.get(key).stream().reduce(Integer::sum).get();
            values.add(key, RA);
        });

        int indexOfMin = 0;

        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) < values.get(indexOfMin)) {
                indexOfMin = i;
            }
        }
        finalAnswer.add(String.valueOf(indexOfMin + 1));
    }
}

