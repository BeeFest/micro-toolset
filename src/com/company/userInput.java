package com.company;

import java.util.Scanner;

public class userInput {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Are you sure you want to quit? [Y, N]");
            String keuze = scanner.nextLine().toUpperCase();
           if (keuze.contains("Y")) {
               System.out.println("Quitting program");
           } else if (keuze.contains("N")) {
               System.out.println("Not quitting program");
           } else {
               System.out.println("Not a valid action");
           }
        }
    }
