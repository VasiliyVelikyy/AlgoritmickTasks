package ru.moskalev.algoritmick_tasks;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
           // int size = scanner.nextInt();
            String temp=scanner.nextLine();
            String enterStr = scanner.nextLine();
            System.out.println(enterStr);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }
}
