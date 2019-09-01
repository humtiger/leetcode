package com.jimmy.answer.question10p;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length < 1) {
            return "";
        }

        int minSize = Integer.MAX_VALUE;
        List<char[]> list = new ArrayList<>();
        for (String str : strs) {
            list.add(str.toCharArray());
            minSize = Math.min(minSize, str.length());
        }
        boolean flag = true;
        Character same;
        char[] result = new char[minSize];
        int idx = 0;
        for (int i = 0; i < minSize; i++) {
            same = null;
            for (char[] chars : list) {
                if (Objects.isNull(same)) {
                    same = chars[idx];
                }
                if (same != chars[idx]) {
                    flag = false;
                }
            }
            if (!flag) {
                break;
            }
            result[idx] = same;
            idx++;
        }
        return new String(result).trim();
    }

}
