package com.jimmy.answer.question10p;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void longestCommonPrefix() {
        String s = longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        Assert.assertEquals("fl", s);
    }


    @Test
    public void givenStringArrayWhenNoSamePrefixThenEmpty() {
        String s = longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        Assert.assertEquals("", s);
    }

    @Test
    public void givenStringArrayWhenOneThenAll() {
        String s = longestCommonPrefix.longestCommonPrefix(new String[]{"dog"});
        Assert.assertEquals("dog", s);
    }

    @Test
    public void givenStringArrayWhenEmptyStringThenEmpty() {
        String s = longestCommonPrefix.longestCommonPrefix(new String[]{""});
        Assert.assertEquals("", s);
    }

    @Test
    public void givenStringArrayWhenEmptyArrayThenEmpty() {
        String s = longestCommonPrefix.longestCommonPrefix(new String[0]);
        Assert.assertEquals("", s);
    }
}