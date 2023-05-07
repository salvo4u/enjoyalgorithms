//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class Solution {
    public int findMin(int[] nums) {
        int lo = 0,hi = nums.length-1;
        int mid = lo +(hi-lo)/2;
        while(lo<=hi){
            mid = lo +(hi-lo)/2;
            if(mid>0&& nums[mid]<nums[mid-1])
                break;
            if(nums[mid]>=nums[lo] && nums[mid]>nums[hi]){
                lo = mid + 1;
            }
            else 
                hi = mid-1;
            
        }
        return nums[mid];
    }
}
