package LeetCode.TopInterviewQuestions.EasyCollection;

public class Array {

    public static void main(String[] args) {

    }

}

class Solution {
    /** https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
     * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int curVal = nums[0];
        int uniqueCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != curVal) {
                curVal = nums[i];
                uniqueCount++;
                nums[uniqueCount - 1] = nums[i];
            }
        }
        return uniqueCount;
    }

    /** https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
     * Say you have an array prices for which the ith element is the price of a given stock on day i.
     * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
     * (i.e., buy one and sell one share of the stock multiple times).
     */
    public static int maxProfit(int[] prices) {

        return 0;
    }
}