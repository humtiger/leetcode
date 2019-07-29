package com.jimmy.answer.question;

import java.util.Arrays;
import java.util.Objects;

public class Solution {
    public String longestPalindrome(String s) {

        if (s.length() > 1000) {
            throw new IllegalArgumentException("字符串太长");
        }

        if (s.length() < 1) {
            return "";
        }

        char[] chars = s.toCharArray();

        int maxSize = 0;
        char[] result = new char[]{};

        for (int i = 0; i < chars.length; i++) {
            int j = i + 1;
            for (; j < chars.length; j++) {
                char[] copyOfRange = Arrays.copyOfRange(chars, i, j + 1);
                if (isPalindromic(copyOfRange) && !Objects.equals(copyOfRange[0], copyOfRange[1])) {
                    if (copyOfRange.length > maxSize) {
                        result = copyOfRange;
                        maxSize = copyOfRange.length;
                    }
                }
            }
        }

        if (result.length < 1) {
            return String.valueOf(chars[0]);
        }
        return new String(result);
    }

    private boolean isPalindromic(char[] chars) {
        for (int i = 0; i < chars.length / 2; i++) {
            if (!Objects.equals(chars[i], chars[chars.length - i - 1])) {
                return false;
            }
        }
        return true;
    }

}
