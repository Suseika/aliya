package com.aliya;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();

        if (pointIsInArea(x, y)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    // В задаче не сказано, включены ли в множество границы множества, так
    // что к строгому/нестрогому сравнению могут возникнуть вопросы

    private static boolean pointIsInArea(double x, double y) {
        return vectorLength(x, y) < 8
            && !in2Quadrant(x, y)
            && !in4Quadrant(x, y)
            && !inCircle(x, y, 3, 4, 3);
    }

    private static boolean inCircle(
        double x,
        double y,
        double circleCenterX,
        double circleCenterY,
        double circleRadius
    ) {
        double dx = circleCenterX - x;
        double dy = circleCenterY - y;
        return vectorLength(dx, dy) < circleRadius;
    }

    private static boolean in4Quadrant(double x, double y) {
        return x < 0 && y > 0;
    }

    private static boolean in2Quadrant(double x, double y) {
        return x > 0 && y < 0;
    }

    private static double vectorLength(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

}
