package com.codeagles.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 */
public class LC1 {


    public static void main(String[] args) {
        LC1 lc1 = new LC1();
        int[] nums = {2, 7, 11, 15};
        lc1.twoSum(nums, 9);
    }
    public int[] twoSum(int[] nums, int target) {
        int[] resUms = new int[2];
        Map<Integer, Integer> targetMap = new HashMap<Integer, Integer>();
        for(int i = 0; i <nums.length; i++) {
            int res = target - nums[i];
            if(targetMap.containsKey(res)) {
                resUms[0] =  targetMap.get(res);
                resUms[1] = i;
            }else {
                targetMap.put(nums[i], i);
            }
        }
        return resUms;
    }
}
