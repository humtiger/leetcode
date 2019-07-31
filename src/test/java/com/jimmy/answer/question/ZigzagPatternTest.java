package com.jimmy.answer.question;

import org.junit.Assert;
import org.junit.Test;

public class ZigzagPatternTest {

    private ZigzagPattern zigzagPattern = new ZigzagPattern();

    @Test
    public void convert() {

        String paypalishiring = zigzagPattern.convert("PAYPALISHIRING", 3);

        Assert.assertNotNull(paypalishiring);

        Assert.assertEquals("PAHNAPLSIIGYIR", paypalishiring);

    }
}