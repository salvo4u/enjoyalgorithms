//https://leetcode.com/problems/first-missing-positive/
class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int index = nums[i]-1;
            if(nums[i]<=nums.length && nums[i]>0 && nums[index]!=nums[i]){
               
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return nums.length+1;
        
    }
}
