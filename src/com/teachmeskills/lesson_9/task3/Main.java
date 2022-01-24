package com.teachmeskills.lesson_9.task3;

/**
 * 3. Дана строка произвольной длины с произвольными словами.
 *   Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры.
 *   Если таких слов несколько, найти первое из них.
 *   Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */

public class Main {
    public static void main(String[] args) {

        String sr = "fffff ab f 1234 jkjk";
        System.out.println(Finish.findSymbols(sr));
    }
}