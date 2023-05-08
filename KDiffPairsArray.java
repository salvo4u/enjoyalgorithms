//https://leetcode.com/problems/k-diff-pairs-in-an-array/
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null)
                map.put(nums[i],0);
            map.put(nums[i],map.get(nums[i])+1);
        }
        int count = 0;
        for (int number: map.keySet())        
        {  
            if(k==0 && map.get(number)>1){
                count++;
            }
            if(k!=0 && map.get(number+k)!=null)
                count++;
        }   
        return count;
    }  
}
