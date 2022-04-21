package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class countA {

    public static void main(String[] args) {
        int letterA = 0;

        ArrayList<String> letters = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String s = scanner.nextLine().toUpperCase(Locale.ROOT);
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'A'){
                letterA++;
            }
        }
        System.out.println("The letter 'a' was counted " + letterA + " times in the word you entered");
    }
}
