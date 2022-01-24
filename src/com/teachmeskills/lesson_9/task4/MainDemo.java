package com.teachmeskills.lesson_9.task4;

public class MainDemo {

    static boolean isPolindrome(String[] arrSr, int number) {
        String sr = arrSr[number];
        StringBuilder s = new StringBuilder(sr);
        StringBuilder s1 = new StringBuilder(sr);

        s.reverse();
        if (s.toString().equals(s1.toString())) {
            return true;
        } else {
            return false;
        }
    }
}