package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Test {

    public static void main(String[] args) {
        //Задано множество фамилий сотрудников. Разработать программу, которая отображает все фамилии, начинающиеся на букву «J». Задачу решить с использованием Stream API.
        System.out.println("task1: " + task1());

        //Задан массив строк. Используя средства StreamAPI отсортировать строки в лексикографическом порядке.
        System.out.println("task2: " + taks2());

        //вывести по количеству букв в имени
        System.out.println("task3: " + taks3());
    }

    private static String taks3() {
        String answer3 = Arrays.asList(initArray1()).stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else if (o1.length() == o2.length()) return o1.compareTo(o2);
                else return -1;
            }
        }).collect(Collectors.joining(", "));
        return answer3;
    }

    private static String taks2() {
        String answer2 = Arrays.asList(initArray1()).stream().sorted().collect(Collectors.joining(", "));
        return answer2;

    }

    private static String task1() {
        String answer1 = initList1().stream().filter(name -> name.charAt(0) == 'J')
                .collect(Collectors.joining(","));
        return answer1;
    }


    private static List<String> initList1() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kent");
        names.add("Clark");
        names.add("Jack");
        names.add("Alex");
        names.add("Jacks");
        names.add("Jimmi");
        names.add("Ivan");
        return names;
    }

    private static String[] initArray1() {
        String[] AS = {
                "abcd", "bcfk", "def", "jklmn", "jprst",
                "afc", "ambn", "kmk", "qrbd", "jus"
        };
        return AS;
    }








}
