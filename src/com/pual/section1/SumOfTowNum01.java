package com.pual.section1;

import java.util.HashMap;
import java.util.Map;



//这是第一题
public class SumOfTowNum01 {
        public static int[] twoSum(int[] nums, int target) {
            // 创建一个哈希表用于存储数值和对应的索引
            Map<Integer, Integer> numToIndex = new HashMap<>();

            // 遍历数组
            for (int i = 0; i < nums.length; i++) {
                // 计算当前数字所需的补数
                int complement = target - nums[i];

                // 检查补数是否在哈希表中
                if (numToIndex.containsKey(complement)) {
                    return new int[]{numToIndex.get(complement), i};
                }

                // 将当前数字和索引存入哈希表
                numToIndex.put(nums[i], i);
            }

            // 如果没有找到，抛出异常（题目假设总有解，所以一般不会到这里）
            throw new IllegalArgumentException("No two sum solution");
        }

        public static void main(String[] args) {
            // 示例 1
            int[] nums1 = {2, 7, 11, 15};
            int target1 = 9;
            int[] result1 = twoSum(nums1, target1);
            System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]");

            // 示例 2
            int[] nums2 = {3, 2, 4};
            int target2 = 6;
            int[] result2 = twoSum(nums2, target2);
            System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]");

            // 示例 3
            int[] nums3 = {3, 3};
            int target3 = 6;
            int[] result3 = twoSum(nums3, target3);
            System.out.println("Result 3: [" + result3[0] + ", " + result3[1] + "]");
        }
    }


