package com.teachmeskills.lesson_9.task2;

import java.util.Scanner;

/**
 *   2. Дана строка произвольной длины с произвольными словами.
 *   Найти самое короткое слово в строке и вывести его на экран.
 *   Найти самое длинное слово в строке и вывести его на экран.
 *   Если таких слов несколько, то вывести последнее из них.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Remove word from text");
        Scanner scanner = new Scanner(System.in);
        String sdd = scanner.nextLine();

        System.out.println(sdd.trim().toCharArray());
        System.out.println(MyFineshString.isShorterWord(sdd));
    }
}