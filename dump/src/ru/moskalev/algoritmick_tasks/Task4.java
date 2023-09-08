package ru.moskalev.algoritmick_tasks;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        {
            Scanner scanner = null;
            try {
                scanner = new Scanner(System.in);
                String sizeArray = scanner.nextLine();
                System.out.println(enterNumber(Integer.parseInt(sizeArray), scanner));


            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (scanner != null)
                    scanner.close();
            }
        }

    }

    private static int enterNumber(int sizeArray, Scanner scanner) {
        List<Integer> sums=new ArrayList<>();
        for (int i = 0; i <sizeArray ; i++) {
            String str=scanner.nextLine();
            String[]numArr=str.split(" ");
            int sum=0;
            for (int j = 0; j <numArr.length ; j++) {
                sum=sum+Integer.parseInt(numArr[j]);
            }
            sums.add(sum);

        }
       int max= Collections.max(sums);
        return max+1;
    }
}
