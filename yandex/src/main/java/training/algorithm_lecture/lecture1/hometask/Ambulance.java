package training.algorithm_lecture.lecture1.hometask;

import java.util.Scanner;

public class Ambulance {
    public static void main(String[] args) {
        process();
    }



    private static void process() {
        try (Scanner scanner = new Scanner(System.in)) {
            int K1 = scanner.nextInt(); // Номер нужной кв 89
            int M = scanner.nextInt(); // Дом
            int K2 = scanner.nextInt(); // Недавняя кв 41
            int P2 = scanner.nextInt(); // Недавний подъезд 1
            int N2 = scanner.nextInt(); // Недавний этаж 11

            if (K2 >= (P2 - 1) * M + N2 && (P2 - 1) * M + N2 > 1) {


                int K_Emin = (int) Math.ceil((double) (K2 + 1) / ((P2 - 1) * M + N2 + 1)); // квартир на этаже min
                int K_Emax = (int) Math.ceil((double) (K2 - 1) / ((P2 - 1) * M + N2 - 1)); // квартир на этаже max
                int N1 = (int) Math.ceil((double) K1 / K_Emin); //высчитываем как был бы этаж если был бы 1 подъезд
                int P1 = (int) Math.ceil((double) N1 / M); //высчитываем подъезд так как известно количество этажей в доме
                N1 = (N1 - 1) % M + 1;

                if (N1 != (int) Math.ceil((double) K1 / K_Emax) % M) {
                    N1 = 0;
                }

                if (P1 != (int) Math.ceil((double) (int) Math.ceil((double) K1 / K_Emax) / M)) {
                    P1 = 0;
                }

                System.out.println(P1 + " " + N1);
            } else if (P2 == 1 && N2 == 1 && K1 <= K2) {
                System.out.println("1 1");
            } else if (P2 == 1 && N2 == 1 && M == 1) {
                System.out.println("0 1");
            } else if (P2 == 1 && N2 == 1) {
                System.out.println("0 0");
            } else {
                System.out.println("-1 -1");
            }


        } catch (Exception e) {

            System.out.println("-1 -1");
        }
    }
}
