package com.company;

import java.util.Scanner;

public class rekenen {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Give me a number please");
        System.out.print("number one: ");
        int number1 = (int) input.nextDouble();
        System.out.println("Give me another number please");
        System.out.print("number two: ");
        int number2 = (int) input.nextDouble();
        int result = number1 / number2;
        System.out.print(number1+ " divided by "+ number2+ " is "+ result);
    }
}