package com.company;

import java.util.Scanner;

public class rekenmachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.print("provide number1: ");
        int number1 = (int) scanner.nextInt();
        System.out.print("provide number2: ");
        int number2 = (int) scanner.nextInt();
        scanner.nextLine();
        System.out.print("provide operator (+, -, / or *): ");
        String operator = scanner.nextLine();
        int result = 0;
        if (operator.equals("+")) {
            result = number1 + number2;
        } else if (operator.equals("-")) {
            result = number1 - number2;
        } else if (operator.equals("/")) {
            result = number1 / number2;
        } else if (operator.equals("*")) {
            result = number1 * number2;
        }
        System.out.println(number1+ " "+ operator+ " "+ number2+ " = "+ result);
    }
}