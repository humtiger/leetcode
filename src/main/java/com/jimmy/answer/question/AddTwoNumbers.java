package com.jimmy.answer.question;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author jimmy
 */
public class AddTwoNumbers {
    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        if (l1.size() != l2.size()) {
            throw new IllegalArgumentException("两个链表的size不相等");
        }
        ListIterator<Integer> listIterator = l1.listIterator();
        ListIterator<Integer> listIterator2 = l2.listIterator();
        LinkedList<Integer> invertedResutlt = new LinkedList<>();

        int upper = 0;
        while (listIterator.hasNext()) {
            int temp = listIterator.next() + listIterator2.next();
            if (upper == 1) {
                temp++;
                upper = 0;
            }
            if (temp > 9) {
                upper = 1;
            }
            invertedResutlt.add(temp % 10);
        }
        ListIterator<Integer> integerListIterator = invertedResutlt.listIterator();
        LinkedList<Integer> resutlt = new LinkedList<>();
        while (integerListIterator.hasNext()) {
            integerListIterator.next();
        }
        while (integerListIterator.hasPrevious()) {
            resutlt.add(integerListIterator.previous());
        }
        return resutlt;
    }
}
