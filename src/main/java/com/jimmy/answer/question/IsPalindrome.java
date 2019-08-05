package com.jimmy.answer.question;

public class IsPalindrome {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x % 10 == 0) {
            return false;
        }
        int back = 0;
        while (x > back) {
            back = back * 10 + x % 10;
            x = x / 10;
        }
        return (x == back) || (x == back / 10);
    }

}
