package com.jimmy.answer.question10p;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntToRomanTest {

    private IntToRoman intToRoman = new IntToRoman();

    @Test
    public void givenIntegerWhenLeftThen4ThenI() {
        String s = intToRoman.intToRoman(3);
        Assert.assertEquals("III", s);
    }

    @Test
    public void givenIntegerWhen4ThenIV() {
        String s = intToRoman.intToRoman(4);
        Assert.assertEquals("IV", s);
    }

    @Test
    public void givenIntegerWhen9ThenIX() {
        String s = intToRoman.intToRoman(9);
        Assert.assertEquals("IX", s);
    }

    @Test
    public void givenIntegerWhen58ThenLVIII() {
        String s = intToRoman.intToRoman(58);
        Assert.assertEquals("LVIII", s);
    }

    @Test
    public void givenIntegerWhen1994ThenMCMXCIV() {
        String s = intToRoman.intToRoman(1994);
        Assert.assertEquals("MCMXCIV", s);
    }
}