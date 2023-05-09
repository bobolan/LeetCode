package com.leetCode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复元素
 *
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,1]
 * 输出：true
 * 示例 2：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：false
 * 示例3：
 *
 * 输入：nums = [1,1,1,3,3,4,3,2,4,2]
 * 输出：true
 *
 */
public class Solution3 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));

        int[] nums1 = {1,2,3,4};
        System.out.println(containsDuplicate(nums1));

        int[] nums2 = {1,2,3,1};
        System.out.println(containsDuplicate(nums2));
    }

    /**
     * 利用HashSet特性的解法
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for (int num: nums) {
            if(!temp.add(num)){
                return true;
            }
        }
        return false;
    }
}
