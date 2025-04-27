package testtask;

import java.util.*;
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int n = scanner.nextInt();


            int[] count = new int[201];
            long totalPairs = 0;

            for (int i = 0; i < n; i++) {
                int price = scanner.nextInt();

                for (int j = 1; j < price; j++) {
                    totalPairs += count[j];
                }

                count[price]++;
            }

            System.out.println(totalPairs);

            scanner.close();
        }
    }

