package com.company;

public class lijst {
    public static void main(String[] args) {
        int[] arraylijst = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arraylijst.length; i++) {
            System.out.print(arraylijst[i]+ " ");
        }
        System.out.println("-----------");
        for (int i = arraylijst.length - 1; i >= 0; i--) {
            System.out.print(arraylijst[i]+ " ");
        }
        System.out.println("------------");
        int lijstsom = 0;
        for (int i =0 ;i < arraylijst.length - 1;i++) {
            lijstsom = lijstsom + i;
        }
        System.out.println("Som is "+lijstsom);
        int gemiddelde = lijstsom / arraylijst.length;
        System.out.println("Gemiddelde is "+ gemiddelde);
    }
}

