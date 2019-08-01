package com.jimmy.answer.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyAtoi {

    /**
     * ascii 2 integer
     *
     * @param str
     * @return 9 :57
     * 1 :49
     * 0 :48
     * . 46
     * - 45
     * + 43
     * white space 32
     */

    public int myAtoi(String str) {

        char[] chars = str.toCharArray();

        List<Character> list = new ArrayList<>();

        boolean nagative = true;
        boolean firstFlag = true;

        for (char c : chars) {
            if (c == 32) {
                continue;
            }

            if (firstFlag) {
                if (c == 45) {
                    nagative = false;
                    firstFlag = false;
                    continue;
                } else if (c == 43) {
                    firstFlag = false;
                    continue;
                } else if (c > 57 || c < 48) {
                    return 0;
                }
                firstFlag = false;
            }

            if (c <= 57 && c >= 48) {
                list.add(c);
                continue;
            }
            break;
        }

        int size = list.size();

        long count = 0;
        long temp;
        int idx = 0;
        for (int i = size; i > 0; i--) {
            temp = getInt(list.get(idx));
            for (int j = 1; j < i; j++) {
                temp = temp * 10;
            }
            count += temp;
            idx++;
        }
        if (!nagative) {
            count = -count;
        }
        if (count > (long) Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (count < (long) Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) count;
    }

    private int getInt(char c) {
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
        }
        throw new IllegalArgumentException();
    }

    class Number {
        private char c;

        public Number(char c) {
            this.c = c;
        }
    }

}
