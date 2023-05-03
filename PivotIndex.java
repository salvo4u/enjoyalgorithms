//https://leetcode.com/problems/find-pivot-index/
class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int leftsum = 0;
        
        for(int i=0;i < nums.length;i++){
            if(i>0)
                leftsum+=nums[i-1];
            int rightsum = totalsum - leftsum - nums[i];
            if(leftsum == rightsum)
                return i;
        }
        return -1;
    }
}
