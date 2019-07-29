package com.jimmy.answer.question;


import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Objects;

public class AddTwoNumbersTest {
    @Test
    public void addTwoNumbers() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(3);

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(5);
        linkedList2.add(6);
        linkedList2.add(4);

        AddTwoNumbers test = new AddTwoNumbers();
        LinkedList result = test.addTwoNumbers(linkedList, linkedList2);
        Assert.assertTrue(Objects.nonNull(result));
        Assert.assertEquals(result.size(), 3);
        Assert.assertEquals(8, result.getFirst());
        Assert.assertEquals(0, result.get(1));
        Assert.assertEquals(7, result.getLast());
    }
}