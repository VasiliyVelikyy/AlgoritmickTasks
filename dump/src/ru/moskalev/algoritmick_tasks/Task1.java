package ru.moskalev.algoritmick_tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String sizeArray = scanner.nextLine();
            System.out.println(enterNumber(sizeArray, scanner));


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }

    private static String enterNumber(String sizeArray, Scanner scanner) {
        String numStr = scanner.nextLine();
        String[] num = numStr.split(" ");

        int indexMax = 0;
        int indexMin = 0;

        int min=Integer.parseInt(num[0]);
        int max=Integer.parseInt(num[0]);
        for (int i = 0; i < num.length; i++) {
            int temp=Integer.parseInt(num[i]);
            if (min > temp) {
                min =temp;
                indexMin = i;
            }
            if (max <= temp) {
                max = temp;
                indexMax = i;
            }
        }
        indexMin = indexMin + 1;
        indexMax = indexMax + 1;


        return indexMax + " " + indexMin;
    }
}

