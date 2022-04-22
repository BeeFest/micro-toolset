package com.company;

import java.util.Locale;
import java.util.Scanner;

public class alphabetPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.print("Which letter do you want to check? ");
        String s = scanner.nextLine().toUpperCase(Locale.ROOT);
        int index = alpha.indexOf(s);
        System.out.println("Letter " + s + " is on position " + ++index + " on the alphabet!");
    }

}
