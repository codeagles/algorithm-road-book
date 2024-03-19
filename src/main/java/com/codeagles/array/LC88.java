package com.codeagles.array;

/**
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */
public class LC88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n -1;
        int nums1_index = m-1;
        int nums2_index = n-1;
        for (int i=0; i < m+n; i++) {
            if (nums2_index < 0 || nums1_index >= 0 && nums1[nums1_index] >= nums2[nums2_index]) {
                nums1[length--] = nums1[nums1_index--];
            }else{
                nums1[length--] = nums2[nums2_index--];
            }

        }
    }
}
