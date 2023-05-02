//https://leetcode.com/problems/majority-element/
class Solution {
    public int majorityElement(int[] nums) {
        int majorityelement = nums[0],count = 1;
        for(int i=1;i<nums.length;i++){
             if(count==0)
                majorityelement = nums[i];
            if(majorityelement == nums[i]){
                count++;
            }else{
                count--;
               
            }
        }
        return majorityelement;
    }
}
