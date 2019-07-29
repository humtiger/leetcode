package com.jimmy.answer.question;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum test = new TwoSum();
        int[] ints = new int[]{2, 7, 11, 15};
        int[] result = test.twoSum(ints, 9);
        Assert.assertTrue(Objects.nonNull(result));
        Assert.assertEquals(2, result.length);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);
    }

    @Test
    public void givenArrayAndSumWhen324And6Then12() {
        TwoSum test = new TwoSum();
        int[] ints = new int[]{3, 2, 4};
        int[] result = test.twoSum(ints, 6);
        Assert.assertTrue(Objects.nonNull(result));
        Assert.assertEquals(2, result.length);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);
    }
}