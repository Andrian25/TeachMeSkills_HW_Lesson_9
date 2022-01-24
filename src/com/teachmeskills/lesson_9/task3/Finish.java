package com.teachmeskills.lesson_9.task3;

    import java.util.Arrays;

    class Finish {

        static String findSymbols(String sr) {
            String[] arraySr = sr.split(" ");
            char[] arrayChar = sr.toCharArray();
            int[] arraySameSymb = new int[arraySr.length];

            int sameSymb = 0;
            char lastSymb = arrayChar[0];
            int j = 0;

            for (int i = 0; i < arrayChar.length; i++) {
                if (arrayChar[i] == ' ') {
                    arraySameSymb[j] = sameSymb - 1;
                    j++;
                    sameSymb = 0;
                    lastSymb = arrayChar[i + 1];
                } else if (lastSymb == arrayChar[i]) {
                    sameSymb++;
                } else if (lastSymb != arrayChar[i]) {
                    lastSymb = arrayChar[i];
                }
                if (i == arrayChar.length - 1) {
                    arraySameSymb[j] = sameSymb;
                }
            }
            System.out.println(Arrays.toString(arraySameSymb));
            sameSymb = finMax(arraySameSymb);

            return arraySr[sameSymb];
        }

        private static int finMax(int[] arr) {
            int max = arr[0];
            int ind = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    ind = i;
                }
            }
            return ind;
        }
    }