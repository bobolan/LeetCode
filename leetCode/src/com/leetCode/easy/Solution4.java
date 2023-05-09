package com.leetCode.easy;

/**
 * 只出现一次的数字
 *
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 *
 * 示例 1 ：
 *
 * 输入：nums = [2,2,1]
 * 输出：1
 * 示例 2 ：
 *
 * 输入：nums = [4,1,2,1,2]
 * 输出：4
 * 示例 3 ：
 *
 * 输入：nums = [1]
 * 输出：1
 */
public class Solution4 {
    public static void main(String[] args) {

    }

    /**
     * 使用集合Set解决
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        return 0;
    }

    /**
     * 位运算解决
     *
     * 位与（&）：二元运算符，两个为1时结果为1，否则为0
     * 位或（|）：二元运算符，两个其中有一个为1时结果就为1，否则为0
     * 位异或（^）：二元运算符，两个数同时为1或0时结果为1，否则为0
     * 位取非（~）：一元运算符，取反操作
     * 左移（<<）：一元运算符，按位左移一定的位置。高位溢出，低位补符号位，符号位不变。
     * 右移（>>）：一元运算符，按位右移一定的位置。高位补符号位，符号位不变，低位溢出。
     * 无符号右移（>>>）：一元运算符，符号位（即最高位）保留，其它位置向右移动，高位补零，低位溢出。
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums) {
        return 0;
    }
}
