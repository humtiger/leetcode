package com.jimmy.answer.question;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {
        LetCodeTest test = new LetCodeTest();
        int[] ints = new int[]{2, 7, 11, 15};
        int[] result = test.twoSum(ints, 9);
        Assert.assertTrue(Objects.nonNull(result));
        Assert.assertEquals(2, result.length);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);

    }
}