package com.aliya;

import java.util.Scanner;

public final class Problem8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scanner.nextLine();
        System.out.print("Enter letter: ");
        Character searchedLetter = scanner.next().charAt(0);
        final String[] words = string.split(" ");

        System.out.println("---");
        System.out.println("Words with letter " + searchedLetter + ":");
        for (String word : words) {
            final char[] lettersInWord = word.toCharArray();
            for (char letterInWord : lettersInWord) {
                if (letterInWord == searchedLetter) {
                    System.out.println(word);
                    break;
                }
            }
        }
    }

}
