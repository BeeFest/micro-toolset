package com.company;

import java.util.Scanner;

public class menukeuze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Keuzes");
        System.out.println("1. print hallo");
        System.out.println("2. print doei");
        System.out.print("Maak je keuze:");
        int keuze = (int) scanner.nextDouble();
        if (keuze==1) {
            System.out.println("hallo");
        } else if (keuze==2) {
            System.out.println("doei");
        } else {
            System.out.println("Voer een correcte menukeuze in");
        }
    }
}