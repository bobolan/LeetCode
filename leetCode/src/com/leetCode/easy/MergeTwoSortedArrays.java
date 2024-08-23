package com.leetCode.easy;

import com.leetCode.easy.utils.Stopwatch;
import java.util.concurrent.TimeUnit;

public class MergeTwoSortedArrays
{
    //https://leetcode.com/problems/merge-sorted-array/
    public static void main(String[] args) {
        int m = 1000000;
        int n = 1000000;
        int[] nums1 = new int[m+n];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i + 1;
        }
        int[] nums2 = new int[n];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = 2 * (i + 1);
        }
        Stopwatch sw = new Stopwatch();
        sw.start();
        merge(nums1, m, nums2, n);
        sw.stop();
        long elapsedTime = sw.getElapsedTime(TimeUnit.MILLISECONDS);
        System.out.println("Merge method took " + elapsedTime + " ms to complete.");
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n)  {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (i>=0&& j>=0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while(j>=0) {
            nums1[k--] = nums2[j--];
        }
    }
}
