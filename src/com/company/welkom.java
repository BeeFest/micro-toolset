package com.company;

import java.util.Scanner;

public class welkom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Submit your name please");
        System.out.print("name: ");
        String s = scanner.nextLine();
        System.out.println("Hallo, " + s);
    }
}

