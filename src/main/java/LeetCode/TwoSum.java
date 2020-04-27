package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        int[] res = Solution.twoSum(new int[]{0, 4, 3, 0}, 0);
        System.out.println(res[0] + " " + res[1]);
    }

}

class Solution {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums != null && nums.length > 1) {
            HashMap<Integer, List<Integer>> numsMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (numsMap.containsKey(nums[i])) {
                    numsMap.get(nums[i]).add(i);
                } else {
                    numsMap.put(nums[i], new LinkedList<>(Arrays.asList(i)));
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (numsMap.containsKey(target - nums[i])) {
                    res[0] = i;
                    List<Integer> l = numsMap.get(target - nums[i]);
                    for (int cur : l) {
                        if (cur != i) {
                            res[1] = cur;
                            return res;
                        }
                    }
                }
            }
        }
        return res;
    }
}
