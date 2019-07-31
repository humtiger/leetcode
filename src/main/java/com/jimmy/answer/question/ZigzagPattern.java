package com.jimmy.answer.question;

import java.util.Iterator;
import java.util.LinkedList;

public class ZigzagPattern {

    private int idx = 0;

    private boolean firstLine = true;

    public String convert(String s, int numRows) {
        if (numRows < 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        for (char aChar : chars) {
            list.add(aChar);
        }

        char[] answer = new char[s.length()];

        int leaseLine = numRows;
        while (!list.isEmpty()) {
            readLine(leaseLine, list.iterator(), answer);
            if (firstLine) {
                firstLine = false;
            }
            leaseLine--;
        }

        return new String(answer);
    }

    private void readLine(int leaseLine, Iterator<Character> iterator, char[] answer) {
        boolean firstColumn = true;
        while (iterator.hasNext()) {
            saveAnswer(answer, iterator);
            if (!firstLine && !firstColumn) {
                saveAnswer(answer, iterator);
            }
            boolean lineEnd = false;
            int moveTime = leaseLine + (leaseLine + -3);
            for (int i = 0; i < moveTime; i++) {
                if (!iterator.hasNext()) {
                    lineEnd = true;
                    break;
                }
                iterator.next();
            }
            if (lineEnd) {
                break;
            }
            firstColumn = false;
        }
    }

    private void saveAnswer(char[] answer, Iterator<Character> iterator) {
        if (!iterator.hasNext()) {
            return;
        }
        answer[idx] = iterator.next();
        idx++;
        iterator.remove();
    }

}
