package training.algorithm_lecture.lecture1.hometask;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Triangle {
    private final static String YES = "YES";
    private final static String NO = "NO";

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.process());
    }

    public String process() {
        Scanner scanner = new Scanner(System.in);
        try {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int third = scanner.nextInt();
            List<Integer> sortedList = Stream.of(first, second, third).sorted().collect(Collectors.toList());
            return evaluateTriangle(sortedList);
        } catch (Exception e) {
            throw new RuntimeException("Operation not supported");
        }
    }

    public String evaluateTriangle(List<Integer> sortedList) {
        if (sortedList.get(0) + sortedList.get(1) > sortedList.get(2)) {
            return YES;
        } else return NO;
    }
}
