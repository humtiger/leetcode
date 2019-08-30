package com.jimmy.answer.question;

public class CountPrimeSetBits {

    public int countPrimeSetBits(int l, int r) {
        if (l > r) {
            return 0;
        }

        int cnt = 0;
        for (int i = l; i <= r; i++) {
            String s = Integer.toBinaryString(i);
            char[] chars = s.toCharArray();
            int charCnt = 0;
            for (char c : chars) {
                if (c == 49) {
                    charCnt++;
                }
            }
            if (isPrime(charCnt)) {
                cnt++;
            }
        }


        return cnt;
    }

    private boolean isPrime(int num) {
        if (num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || num == 17 || num == 19) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(248657
        ));
    }


}
