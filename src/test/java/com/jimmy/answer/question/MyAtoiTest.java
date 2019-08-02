package com.jimmy.answer.question;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyAtoiTest {
    private MyAtoi myAtoi = new MyAtoi();

    @Test
    public void myAtoi() {
        int i = myAtoi.myAtoi("42");
        Assert.assertEquals(42, i);
    }

    @Test
    public void givenStringWhenWithSpaceThenNumber() {
        int i = myAtoi.myAtoi("   -42");
        Assert.assertEquals(-42, i);
    }

    @Test
    public void givenStringWhenLastNotNumberThenNumber() {
        int i = myAtoi.myAtoi("4193 with words");
        Assert.assertEquals(4193, i);
    }

    @Test
    public void givenStringWhenFirstNotNumberThen0() {
        int i = myAtoi.myAtoi("words and 987");
        Assert.assertEquals(0, i);
    }

    @Test
    public void givenStringWhenSmallThenMinIntegerThenMinInteger() {
        int i = myAtoi.myAtoi("-91283472332");
        Assert.assertEquals(-2147483648, i);
    }

    @Test
    public void givenStringWhenBiggerThenMinIntegerThenMinInteger() {
        int i = myAtoi.myAtoi("91283472332");
        Assert.assertEquals(Integer.MAX_VALUE, i);
    }

    @Test
    public void givenStringWhenHaveTwoGroupSpaceThenMiddleNumber() {
        int i = myAtoi.myAtoi("   +0 123");
        Assert.assertEquals(0, i);
    }

    @Test
    public void givenStringWhenBiggerThenLongThenMaxInteger() {
        int i = myAtoi.myAtoi("9223372036854775808");
        Assert.assertEquals(Integer.MAX_VALUE, i);
    }

    @Test
    public void givenStringWhenSmallerThenLongThenMaxInteger() {
        int i = myAtoi.myAtoi("-9223372036854775808");
        Assert.assertEquals(Integer.MIN_VALUE, i);
    }
}