package com.company;

public class tekenen {
    public static void main(String[] args) {
        System.out.println("tekening 1");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("tekening 2");
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("tekening 3");
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4 - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("tekening 4");
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < i; k++)
                System.out.print("  ");
            for (int m = 0; m < 4 - i; m++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("tekening 5");
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
    }
}