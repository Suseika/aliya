package com.aliya;

import java.util.Scanner;

public final class Problem9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a binary number: ");
            String binaryNumberString = scanner.nextLine();
            final int number;
            try {
                number = Integer.parseInt(binaryNumberString, 2);
            } catch (NumberFormatException e) {
                System.out.println(
                    binaryNumberString + " is not a binary number"
                );
                continue;
            }
            System.out.println(binaryNumberString +" in decimal is "+number);
            break;
        }
    }
}
