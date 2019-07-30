package com.jimmy.answer.question;

import java.util.Arrays;
import java.util.Objects;

public class LongestPalindrome {
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
//                char[] copyOfRange = Arrays.copyOfRange(chars, i, j + 1);
//                if (isPalindromic(copyOfRange)) {
//                    if (copyOfRange.length > maxSize) {
//                        result = copyOfRange;
//                        maxSize = copyOfRange.length;
//                    }
//                }

                if (isPalindromic(chars, i, j)) {
                    if (j + 1 - i > maxSize) {
                        result = Arrays.copyOfRange(chars, i, j + 1);
                        maxSize = result.length;
                    }
                }
            }
        }

        if (result.length < 1) {
            return String.valueOf(chars[0]);
        }
        return new String(result);
    }

    private boolean isPalindromic(char[] chars, int start, int end) {
        int half = (end + 1 - start) / 2;
        for (int i = 0; i < half; i++) {
            if (!Objects.equals(chars[start + i], chars[end - i])) {
                return false;
            }
        }
        return true;
    }

    private boolean isPalindromic(char[] chars) {
        int half = chars.length / 2;
        for (int i = 0; i < half; i++) {
            if (!Objects.equals(chars[i], chars[chars.length - i - 1])) {
                return false;
            }
        }
        return true;
    }

}
