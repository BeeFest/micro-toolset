package com.company;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer een zin in:");
        String s = scanner.nextLine();
        System.out.println("Aantal karakters: "+s.length());
        final String[] woorden = s.split(" ");
        System.out.println("Aantal woorden: "+ woorden.length);
    }

}
