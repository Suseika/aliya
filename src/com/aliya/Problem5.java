package com.aliya;

public final class Problem5 {

    public static void main(String[] args) {
        System.out.println(compute());
    }

    private static double compute() {
        double d = 0.1;
        double product = 1;
        for (int i = 0; i < 100; i++) {
            product *= 1 + Math.sin(d * i);
        }
        return product;
    }

}
