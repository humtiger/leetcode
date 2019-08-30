package com.jimmy.answer.question10p;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Roman2IntTest {

    private Roman2Int roman2Int = new Roman2Int();

    @Test
    public void givenStringWhenIIIThen3() {
        int iii = roman2Int.romanToInt("III");
        Assert.assertEquals(3, iii);
    }


    @Test
    public void givenStringWhenIVThen4() {
        int iii = roman2Int.romanToInt("IV");
        Assert.assertEquals(4, iii);
    }


    @Test
    public void givenStringWhenIXThen9() {
        int iii = roman2Int.romanToInt("IX");
        Assert.assertEquals(9, iii);
    }

    @Test
    public void givenStringWhenLVIIIThen58() {
        int iii = roman2Int.romanToInt("LVIII");
        Assert.assertEquals(58, iii);
    }

    @Test
    public void givenStringWhenMCMXCIVThen1994() {
        int iii = roman2Int.romanToInt("MCMXCIV");
        Assert.assertEquals(1994, iii);
    }

    @Test
    public void givenStringWhenMMCDXXVThen2425() {
        int iii = roman2Int.romanToInt("MMCDXXV");
        Assert.assertEquals(2425, iii);
    }

    @Test
    public void givenStringWhenCCCIThen301() {
        int iii = roman2Int.romanToInt("CCCI");
        Assert.assertEquals(301, iii);
    }
}