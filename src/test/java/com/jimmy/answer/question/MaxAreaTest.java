package com.jimmy.answer.question;

import com.jimmy.answer.question10p.MaxArea;
import org.junit.Assert;
import org.junit.Test;

public class MaxAreaTest {

    MaxArea maxArea = new MaxArea();

    @Test
    public void givenArrayWhenThen49() {

        int[] param = {
                1, 8, 6, 2, 5, 4, 8, 3, 7
        };
        int i = maxArea.maxArea(param);
        Assert.assertEquals(i, 49);

    }

    @Test
    public void givenArrayWhenThen8() {

        int[] param = {
                1, 8
        };
        int i = maxArea.maxArea(param);
        Assert.assertEquals(i, 1);

    }

    @Test
    public void givenArrayWhenSize1Then0() {

        int[] param = {
                1
        };
        int i = maxArea.maxArea(param);
        Assert.assertEquals(i, 0);

    }

    @Test
    public void givenArrayWhenEmptyThen0() {

        int[] param = new int[0];
        int i = maxArea.maxArea(param);
        Assert.assertEquals(i, 0);

    }
}