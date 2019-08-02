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
                if (!firstFlag) {
                    break;
                }
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
        if (size > 10) {
            return nagative ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        long count = 0;
        long temp;
        int idx = 0;
        for (int i = size; i > 0; i--) {
            temp = list.get(idx) - 48;
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

}
