package com.company;

import java.util.Locale;
import java.util.Scanner;

public class checkUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you sure you want to quit [Y, N]?");
        String s = scanner.nextLine();
        s = s.toUpperCase(Locale.ROOT);
        if (s.equals("Y")) {
            System.out.println("Quitting program");
        }
        else if (s.equals("N")) {
            System.out.println("Cancel");
        } else System.out.println("No valid input");
    }

}
