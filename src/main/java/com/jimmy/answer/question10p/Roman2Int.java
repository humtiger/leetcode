package com.jimmy.answer.question10p;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>workspace</h3>
 * <p>罗马数字转阿拉伯数字</p>
 *
 * @author : fanjm
 * @date : 2019-08-30 13:19
 */
public class Roman2Int {

    private final static Map<Character, Integer> relationship = new HashMap<>();

    static {
        relationship.put('I', 1);
        relationship.put('V', 5);
        relationship.put('X', 10);
        relationship.put('L', 50);
        relationship.put('C', 100);
        relationship.put('D', 500);
        relationship.put('M', 1000);
    }


    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 1) {
            return relationship.get(chars[0]);
        }
        int temp = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            Integer a = relationship.get(chars[i]);
            Integer b = relationship.get(chars[i + 1]);
            if (a >= b) {
                temp += a;
            } else {
                temp = temp + b - a;
                i++;
            }
        }
        if (relationship.get(chars[chars.length - 1]) <= relationship.get(chars[chars.length - 2])) {
            temp += relationship.get(chars[chars.length - 1]);
        }
        return temp;
    }
}
