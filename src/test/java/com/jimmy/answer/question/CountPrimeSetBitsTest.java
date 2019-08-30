package com.jimmy.answer.question;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountPrimeSetBitsTest {

    private CountPrimeSetBits countPrimeSetBits = new CountPrimeSetBits();

    @Test
    public void countPrimeSetBits() {
        int i = countPrimeSetBits.countPrimeSetBits(1, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void givenTwoNumberWhenLLittleThen0() {
        int i = countPrimeSetBits.countPrimeSetBits(1, 1);
        Assert.assertEquals(0, i);
    }


    @Test
    public void givenTwoNumberWhenSixAndTenThen4() {
        int i = countPrimeSetBits.countPrimeSetBits(6, 10);
        Assert.assertEquals(4, i);
    }

    @Test
    public void givenTwoNumberWhenTenAndFifteenThen5() {
        int i = countPrimeSetBits.countPrimeSetBits(10, 15);
        Assert.assertEquals(5, i);
    }

    @Test
    public void givenTwoNumberWhen248657And257888Then3381() {
        int i = countPrimeSetBits.countPrimeSetBits(248657, 257888);
        Assert.assertEquals(3381, i);
    }

    @Test
    public void givenTwoNumberWhen257888And257888Then1() {
        int i = countPrimeSetBits.countPrimeSetBits(257888, 257888);
        Assert.assertEquals(1, i);
    }
}