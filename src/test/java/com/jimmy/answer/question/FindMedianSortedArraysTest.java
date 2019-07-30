package com.jimmy.answer.question;

import org.junit.Assert;
import org.junit.Test;

public class FindMedianSortedArraysTest {

    private FindMedianSortedArrays leetCode = new FindMedianSortedArrays();

    @Test
    public void diffLengthArray() {

        int[] longger = new int[]{1, 3};
        int[] shorter = new int[]{2};


        double medianSortedArrays = leetCode.findMedianSortedArrays(longger, shorter);

        Assert.assertEquals(0, Double.compare(2.0, medianSortedArrays));
    }

    @Test
    public void sameLengthArray() {

        int[] longger = new int[]{1, 2};
        int[] shorter = new int[]{3, 4};

        double medianSortedArrays = leetCode.findMedianSortedArrays(longger, shorter);
        Assert.assertEquals(0, Double.compare(2.5, medianSortedArrays));
    }


    @Test
    public void givenTwoArray() {


        int[] longger = new int[]{2, 4, 6, 8};
        int[] shorter = new int[]{3, 4};

        double medianSortedArrays = leetCode.findMedianSortedArrays(longger, shorter);
        Assert.assertEquals(0, Double.compare(4, medianSortedArrays));
    }
}