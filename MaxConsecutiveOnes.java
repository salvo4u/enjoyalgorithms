//https://leetcode.com/problems/max-consecutive-ones/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //Use sliding window
        int count = 0,maxlen = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxlen = Math.max(count,maxlen);
            }else{
                count = 0;
            }
        }    
        return maxlen;   
    }
}
