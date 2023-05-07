//https://leetcode.com/problems/minimum-size-subarray-sum/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,n = nums.length;
        int p1 = 0,p2 = 0,minlength =  Integer.MAX_VALUE;;
        while(p2<n){
            sum+=nums[p2];
            p2++;
            while(sum>=target){
                sum=sum-nums[p1];
                minlength = Math.min(minlength,p2-p1);
                p1++;   
            }
        }
         return minlength == Integer.MAX_VALUE ? 0 : minlength;
    }
}
