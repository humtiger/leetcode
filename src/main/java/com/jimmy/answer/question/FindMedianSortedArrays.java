package com.jimmy.answer.question;

import java.math.BigDecimal;
import java.util.Objects;

public class FindMedianSortedArrays {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] all = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int allIdx = 0;
        while (true) {
            if (i == nums1.length) {
                copyLeaseData(nums2, all, j, allIdx);
                break;
            }
            if (j == nums2.length) {
                copyLeaseData(nums1, all, i, allIdx);
                break;
            }

            if (Objects.equals(nums1[i], nums2[j])) {
                all[allIdx] = nums1[i];
                all[allIdx + 1] = nums2[j];
                allIdx += 2;
                i++;
                j++;
                continue;
            }
            if (nums1[i] > nums2[j]) {
                all[allIdx] = nums2[j];
                allIdx++;
                j++;
            } else {
                all[allIdx] = nums1[i];
                allIdx++;
                i++;
            }
        }

        if (all.length % 2 == 0) {
            double aDouble = (double) all[all.length / 2] + (double) all[all.length / 2 - 1];
            return aDouble / 2;
        } else {
            return all[all.length / 2];
        }
    }

    private void copyLeaseData(int[] nums2, int[] all, int i, int allIdx) {
        while (i < nums2.length) {
            all[allIdx] = nums2[i];
            allIdx++;
            i++;
        }
    }


}
