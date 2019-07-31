package com.jimmy.answer.question;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseDigitsTest {

    private ReverseDigits reverseDigits = new ReverseDigits();

    @Test
    public void reverse() {
        int reverse = reverseDigits.reverse(123);
        Assert.assertEquals(321, reverse);
    }


    @Test
    public void givenNumberWhenLastIsZeroThenLengthDeduct1() {
        int reverse = reverseDigits.reverse(120);
        Assert.assertEquals(21, reverse);
    }


    @Test
    public void givenNumberWhenNegativeThenPositive() {
        int reverse = reverseDigits.reverse(-120);
        Assert.assertEquals(-21, reverse);
    }

    @Test
    public void givenNumberWhenReverseNumberBiggerThenMaxThen() {
        int reverse = reverseDigits.reverse(1234567899);
        Assert.assertEquals(0, reverse);
    }

    @Test
    public void givenNumberWhenNumberSmallerThenMinThen() {
        int reverse = reverseDigits.reverse(-2147483648);
        Assert.assertEquals(0, reverse);
    }
}