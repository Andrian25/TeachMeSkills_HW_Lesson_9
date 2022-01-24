package com.teachmeskills.lesson_9.task2;

class MyFineshString {

    static String isShorterWord(String sdd) {

        String[] arrayWord1 = arrayWord2(sdd);

        int indMin = 0;
        int indMax = 0;
        int min = arrayWord1[0].length();
        int max = 0;

        for (int i = 0; i < arrayWord1.length; i++) {
            if (arrayWord1[i].length() > max) {
                max = arrayWord1[i].length();
                indMax = i;
            } else if (arrayWord1[i].length() == min) {
                min = arrayWord1[i].length();
                indMin = i;
            } else {
                indMax = indMin;
                max = min;
                min = arrayWord1[i].length();
                indMin = i;
            }
        }
        return "the shortest word: " + arrayWord1[indMin] + " " + "the longest word: " + arrayWord1[indMax];
    }

    private static String[] arrayWord2(String sdd) {
        char[] arraySdd = sdd.trim().toCharArray();

        int j = 0;
        for (char item : arraySdd) {
            if (item == ' ') {
                j += 1;
            }
        }

        String[] words = new String[j + 1];
        String word = "";
        int index = 0;

        for (int i = 0; i < words.length; i++) {
            for (int r = index; r < arraySdd.length; r++) {
                if (arraySdd[r] != ' ') {
                    word += arraySdd[r];
                    if (r == arraySdd.length - 1) {
                        words[i] = word;
                    }
                } else {
                    index = r + 1;
                    words[i] = word;
                    word = "";
                    break;
                }
            }
        }
        return words;
    }
}