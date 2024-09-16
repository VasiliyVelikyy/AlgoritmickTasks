package training.algorithm_lecture.lecture1.hometask;

import java.util.Scanner;

public class SquareEquationResolver {
    public static void main(String[] args) {
        process();
    }

    private static void process() {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int k;
            int x;
            if (a == 0 && b == 0 && c == 0 || (a == 0 && b == c * c)) {
                System.out.println("MANY SOLUTIONS");
            } else if (c < 0) {
                System.out.println("NO SOLUTION");
            } else {
                //ax+b=c*c
                c = c * c;
                k = c - b;
                x = k / a;
                if (a * x + b == c) {
                    System.out.println(x);
                } else {
                    System.out.println("NO SOLUTION");
                }
            }
        } catch (Exception e) {
            System.out.println("NO SOLUTION");
        }
    }
}