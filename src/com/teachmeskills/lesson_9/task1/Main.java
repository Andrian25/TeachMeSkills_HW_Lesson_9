package com.teachmeskills.lesson_9.task1;

/**
 *   1.Написать программу со следующим функционалом:
 *   На вход передать строку(будем считать, что это номер документа).
 *   Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.
 *     Вывести на экран в одну строку два первых блока по 4 цифры
 *     Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
 *     Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
 *     Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder)
 *     Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
 *     Проверить начинается ли номер документа с последовательности 555.
 *     Проверить заканчивается ли номер документа на последовательность 1a2b.
 *     Все эти методы реализовать в отдельном классе в статических методах, которые на вход(входным параметром) будут принимать ввводимую на вход программы строку.
 */

public class Main {
    public static void main(String[] args) {

        String numberDoc = "4567-EAE-8900-ECE-9B9B";
        StringBuilder sbDoc = new StringBuilder("4567-EAE-8900-ECE-9B9B");

        System.out.println(NumberDoc.getNum(numberDoc));
        System.out.println(NumberDoc.changeLetter(numberDoc));
        System.out.println(NumberDoc.lettersDoc(numberDoc));
        System.out.println("Letters:" + NumberDoc.lettersDocCD(sbDoc));
        System.out.println(NumberDoc.isContainABC(numberDoc));
        System.out.println(NumberDoc.isТumber(numberDoc));
        System.out.println(NumberDoc.isSigns(numberDoc));
    }
}