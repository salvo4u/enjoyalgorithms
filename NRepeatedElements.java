//https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
class Solution {
    public int repeatedNTimes(int[] nums) {
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+1])
                return nums[i];
            if(nums[i+1]==nums[i+2])
                return nums[i+1];
            if(nums[i]==nums[i+2])
                return nums[i];
        }
        return nums[0];
    }
}
