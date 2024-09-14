package contest.introduction_contest.tasks;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        int count = 0;

        for (int i = 0; i < line2.length(); i++) {
            char c = line2.charAt(i);

            int index = line1.indexOf(c);
            if (index != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
