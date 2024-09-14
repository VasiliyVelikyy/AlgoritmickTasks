package yandex.introduction_contest.tasks;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numbers = line.split(" ");
        try {
            long numberOne = Long.parseLong(numbers[0]);
            long numberTwo = Long.parseLong(numbers[1]);
            System.out.println(numberOne + numberTwo);
        } catch (NumberFormatException e) {
            System.out.println("Not a number in line");
        }
    }
}
