package com.company;

import java.util.Scanner;

public class sumOfANumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a number to add together please: ");
        String s = scanner.nextLine();
        System.out.println("Adding together the following numbers: ");
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            boolean isDigit = Character.isDigit(character);
            if (isDigit) {
                System.out.println(character);
                sum = sum + Character.getNumericValue(character);
            }
        }
        System.out.println("= " + sum);
    }
}
