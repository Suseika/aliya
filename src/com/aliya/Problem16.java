package com.aliya;

import java.util.Scanner;

public final class Problem16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hexNumber = scanner.nextLine();
        System.out.print("Enter the number of digits: ");
        int numberOfDigits = scanner.nextInt();
        if (numberOfDigits > hexNumber.length()) {
            System.out.println(
                "Number " + hexNumber + " has less than " + numberOfDigits + " digits"
            );
            System.exit(1);
        }

        int sum = 0;
        for (int i=0; i<numberOfDigits; i++) {
            sum += Integer.parseInt(
                Character.toString(hexNumber.charAt(i)),
                16
            );
        }

        System.out.println("---");
        System.out.println(
            "Sum is " + Integer.toHexString(sum) + " hex or " + "" + sum + " dec"
        );

    }

}
