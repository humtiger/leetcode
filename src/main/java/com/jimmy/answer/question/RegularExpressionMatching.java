package com.jimmy.answer.question;

public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        char[] charsS = s.toCharArray();
        for (char c : charsS) {
            if (c < 'a' || c > 'z') {
                return false;
            }
        }
        char[] charsP = p.toCharArray();
        for (char c : charsS) {
            if (c < 'a' && c != '.' && c != '*') {
                return false;
            } else if (c > 'z') {
                return false;
            }
        }

        return false;
    }

}
