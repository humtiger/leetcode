package com.jimmy.answer.question;

import java.util.Objects;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        if (Objects.isNull(s) || s.length() == 0) {
            return 0;
        }

        char[] chars = s.toCharArray();
        int maxCnt = 0;
        int cnt = 0;
        int subStringStartIdx = 0;

        int idx = 0;
        while (idx < chars.length) {
            for (int i = subStringStartIdx; i < idx; i++) {
                if (Objects.equals(chars[idx], chars[i])) {
                    subStringStartIdx = i + 1;
                    break;
                }
            }
            cnt = idx - subStringStartIdx + 1;
            if (cnt > maxCnt) {
                maxCnt = cnt;
            }
            idx++;
        }

        return maxCnt;
    }

}
