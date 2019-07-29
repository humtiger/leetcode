package com.jimmy.answer.question;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLongestSubstringTest {

    private LengthOfLongestSubstring leetCode = new LengthOfLongestSubstring();

    @Test
    public void lengthOfLongestSubstring() {


        String param = "abcddfdfdfds";
        int i = leetCode.lengthOfLongestSubstring(param);
        Assert.assertEquals(4, i);
    }

    @Test
    public void test2() {
        String param = "pwwkew";

        int i = leetCode.lengthOfLongestSubstring(param);
        Assert.assertEquals(3, i);
    }

    @Test
    public void noSame() {
        String param = "bwf";

        int i = leetCode.lengthOfLongestSubstring(param);
        Assert.assertEquals(3, i);
    }
}