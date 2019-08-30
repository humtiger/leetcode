package com.jimmy.answer.question;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author jimmy
 */
public class AddTwoNumbers {

//    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
//        if (l1.size() != l2.size()) {
//            throw new IllegalArgumentException("两个链表的size不相等");
//        }
//        ListIterator<Integer> listIterator = l1.listIterator();
//        ListIterator<Integer> listIterator2 = l2.listIterator();
//        LinkedList<Integer> invertedResutlt = new LinkedList<>();
//
//        int upper = 0;
//        while (listIterator.hasNext()) {
//            int temp = listIterator.next() + listIterator2.next();
//            if (upper == 1) {
//                temp++;
//                upper = 0;
//            }
//            if (temp > 9) {
//                upper = 1;
//            }
//            invertedResutlt.add(temp % 10);
//        }
//        ListIterator<Integer> integerListIterator = invertedResutlt.listIterator();
//        LinkedList<Integer> resutlt = new LinkedList<>();
//        while (integerListIterator.hasNext()) {
//            integerListIterator.next();
//        }
//        while (integerListIterator.hasPrevious()) {
//            resutlt.add(integerListIterator.previous());
//        }
//        return resutlt;
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

//        ListNode cur = new ListNode();
//        int upper = 0;
//        while (true) {
//            if (Objects.isNull(l1)) {
//                break;
//            }
//            int temp = l1.val + l2.val;
//            if (upper == 1) {
//                temp++;
//                upper = 0;
//            }
//            if (temp > 9) {
//                upper = 1;
//            }
//            cur.val = (temp % 10);
//
//            cur = cur.next;
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//
//        ListNode result = new ListNode();
//        cur = cur.getPrevious();
//        ListNode resultCur = result;
//        while (true) {
//            if (Objects.isNull(cur)) {
//                break;
//            }
//            resultCur.setVal(cur.getVal());
//            System.out.println(resultCur.getVal());
//            resultCur.setNext(new ListNode());
//            resultCur = resultCur.getNext();
//            cur = cur.getPrevious();
//        }
//
//        return result;
//
        return null;
    }


}

class ListNode implements Serializable {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

}