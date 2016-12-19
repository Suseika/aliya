package com.aliya;

import java.util.Scanner;

public final class Problem3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        System.out.print("Enter x_start: ");
        double xStart = scanner.nextDouble();
        System.out.print("Enter x_end: ");
        double xEnd = scanner.nextDouble();
        if (xEnd < xStart) {
            System.out.println("x_start can't be > x_end");
            System.exit(1);
        }
        System.out.print("Enter dx: ");
        double dx = scanner.nextDouble();
        if (dx < 0) {
            System.out.println("dx must be positive or 0");
            System.exit(1);
        }

        System.out.println("x\tF(x)");
        for (double x = xStart; x < xEnd; x += dx) {
            System.out.print(x + "\t");
            final double value = f(x, a, b, c);
            if (shouldBeReal(a, b, c)) {
                System.out.print(value);
            } else {
                System.out.print((int) value);
            }
            System.out.println();
        }
    }

    private static boolean shouldBeReal(double a, double b, double c) {
        return (((int) a) & ((int) b) ^ ((int) c)) != 0;
    }

    private static double f(double x, double a, double b, double c) {
        if (x < 1 && c != 0) {
            return a * x * x + b / c;
        } else if (x > 1.5 && c == 0) {
            return (x - a) / Math.pow(x - c, 2);
        } else {
            return (x * x) / (c * c);
        }
    }

}
