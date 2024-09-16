package training.algorithm_lecture.lecture1.hometask;

import java.util.Scanner;

public class SquareEquationResolver {
    public static void main(String[] args) {
        SquareEquationResolver resolver = new SquareEquationResolver();
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(resolver.process(a, b, c));
        } catch (Exception e) {
            System.out.println("NO SOLUTION");
        }
    }

    public String process(int a, int b, int c) {
        int k;
        int x;
        if (a == 0 && b == 0 && c == 0 || (a == 0 && b == c * c)) {
            return "MANY SOLUTIONS";
        } else if (c < 0) {
            return "NO SOLUTION";
        } else {
            //ax+b=c*c
            c = c * c;
            k = c - b;
            x = k / a;
            if (a * x + b == c) {
                return String.valueOf(x);
            } else {
                return "NO SOLUTION";
            }
        }

    }
}