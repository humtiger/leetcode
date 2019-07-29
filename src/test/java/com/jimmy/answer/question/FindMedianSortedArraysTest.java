package com.jimmy.answer.question;

import org.junit.Assert;
import org.junit.Test;

public class FindMedianSortedArraysTest {

    private FindMedianSortedArrays leetCode = new FindMedianSortedArrays();

    public void diffLengthArray() {

        int[] longger = new int[]{1, 3};
        int[] shorter = new int[]{2};


        double medianSortedArrays = leetCode.findMedianSortedArrays(longger, shorter);
    }

    @Test
    public void sameLengthArray() {

        int[] longger = new int[]{1, 2};
        int[] shorter = new int[]{3, 4};

        double medianSortedArrays = leetCode.findMedianSortedArrays(longger, shorter);
        Assert.assertTrue(Double.compare(2.5, medianSortedArrays) == 0);
    }

}