package yandex.introduction_contest.tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        try {
            File file = new File(
                    "interview/src/yandex/introduction_contest/task2_input.txt");

            Scanner sc = new Scanner(file);
            String st = String.valueOf(sc.nextLine());

            String[] numbers = st.split(" ");
            long numberOne = Long.parseLong(numbers[0]);
            long numberTwo = Long.parseLong(numbers[1]);
            String answer = String.valueOf(numberOne + numberTwo);
            FileWriter fw = new FileWriter(
                    "interview/src/yandex/introduction_contest/task2_output.txt");

            for (int i = 0; i < answer.length(); i++) {
                fw.write(answer.charAt(i));
            }

            sc.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
