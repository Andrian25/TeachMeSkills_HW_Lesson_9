package com.teachmeskills.lesson_9.task5;

public class MainDemo {

    static String getNewString (String sd){

        StringBuilder sddabl = new StringBuilder();
        char[] arrChar = sd.toCharArray();

        for (char  symb: arrChar) {
            sddabl.append(String.valueOf(symb).concat(String.valueOf(symb)));
        }
        return sddabl.toString();
    }
}