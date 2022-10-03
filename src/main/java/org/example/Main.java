package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Task 1
            System.out.println(numberAsIntegerReturnsNumberAsString(6));
         */

        /*
            Task 2
            printNumbers2();
         */

        /*
            Task 4: write a program which receives words from user and saves them to an array
         */
        Scanner scan = new Scanner(System.in);
        int MAX_LENGTH = 10;
        String[] array = new String[MAX_LENGTH];

        System.out.println("Enter words:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(array[j]);
            }
            array[i] = scan.nextLine();
        }
    }

    public static String numberAsIntegerReturnsNumberAsString(int number) {
        /*
            Task 1: add string numbers from "one" to "ten" to a string array
            Task 2: create a method that returns the corresponding number as a string for a number as an integer
         */
        String[] numbers = new String[] {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        return numbers[number-1];
    }

    public static void printNumbers1() {
        /*
            Task 3: create a method which prints numbers from 1 to 100, but: a) before the numbers % 3 has to be a # sign
            b) before the numbers % 5 has to be a $ sign

            Approach 1: single if block
         */
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("#$" + i);
            } else if (i % 3 == 0) {
                System.out.println("#" + i);
            } else if (i % 5 == 0) {
                System.out.println("$" + i);
            } else {
                System.out.println(i);
            }
        }
    }

    public static void printNumbers2() {
         /*
             Approach 2: 2 separate if blocks
         */
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("#");
            }
            if (i % 5 == 0) {
                System.out.print("$");
            }
            System.out.println(i);
        }
    }

    public static void printNumbers3() {
        /*
             Method 3: using separate method
         */
        for (int i = 1; i <= 100; i++) {
            System.out.println(getSpecialString(i));
        }
    }

    public static String getSpecialString(int number) {
        String result = "";

        if (number % 3 == 0) {
            result += "#";
        }
        if (number % 5 == 0) {
            result += "$";
        }
        result += number;

        return result;
    }
}