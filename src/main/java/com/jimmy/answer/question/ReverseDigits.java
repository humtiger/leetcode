package com.jimmy.answer.question;

public class ReverseDigits {
    public int reverse(int x) {

        if (x <= Integer.MIN_VALUE) {
            return 0;
        }

        int param;
        if (x < 0) {
            param = -x;
        } else {
            param = x;
        }
        int reverseNumber = reversePositive(param);
        if (x < 0) {
            return -reverseNumber;
        } else {
            return reverseNumber;
        }
    }

    private int reversePositive(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int numberLength = chars.length;
        char[] resultNum = new char[numberLength];
        for (int i = 0; i < numberLength; i++) {
            resultNum[numberLength - i - 1] = chars[i];
        }
        Long parseLong = Long.parseLong(new String(resultNum));
        if (parseLong >= Integer.MAX_VALUE) {
            return 0;
        }
        return parseLong.intValue();
    }
}
