package com.teachmeskills.lesson_9.task4;

import java.util.Scanner;

/**
 * 4. Дана строка произвольной длины с произвольными словами.
 * Написать программу для проверки является ли любое выбранное слово в строке полиндромом.
 * Например, есть строка, вводится число 3, значит необходимо проверить является ли 3ей слово в этой строке полиндромом.
 * Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов,
 * а на вход программе передали число 500 и т.п. ситуации.
 */

public class Main {
    public static void main(String[] args) {

        String sd = ("tiger giraffe elephant wolf cat dog zebra enot");
        String[] arrSr = sd.split("");

        int number = isCorrectNumber(arrSr);
        if (MainDemo.isPolindrome(arrSr, number)) {
            System.out.println("word " + arrSr[number] + "not polindrome");
        } else {
            System.out.println("word " + arrSr[number] + "is not polindrome");
        }
    }

    private static int isCorrectNumber(String[] arrSr) {
        System.out.println("insert the number:");
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        boolean correctN = false;
        while (!correctN) {
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Please enter a number greater than 0");
            } else if (number > arrSr.length) {
                System.out.println("Please enter a number less than " + arrSr.length);
            } else {
                correctN = true;
            }
        }
        if (number > 0) {
            number -= 1;
        }
        System.out.println("number " + number);
        return number;
    }
    }