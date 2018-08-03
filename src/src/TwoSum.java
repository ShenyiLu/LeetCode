/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

public class TwoSum {

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int head = 0;
        int tail = 1;
        while ((nums[head] + nums[tail]) != target){
            if(tail == nums.length - 1){
                head++;
                tail = head + 1;
            } else {
                tail++;
            }
        };
        result[0] = head;
        result[1] = tail;
        return result;
//        throw new IllegalArgumentException("No two sum solution");
    }
}