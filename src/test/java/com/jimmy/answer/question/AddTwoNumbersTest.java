package com.jimmy.answer.question;


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

        LetCodeTest test = new LetCodeTest();
        LinkedList result = test.addTwoNumbers(linkedList, linkedList2);
        Assert.assertTrue(Objects.nonNull(result));
        Assert.assertEquals(result.size(), 3);
        assertEquals(8, result.getFirst());
        assertEquals(0, result.get(1));
        assertEquals(7, result.getLast());
    }}