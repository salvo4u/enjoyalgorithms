//https://leetcode.com/problems/container-with-most-water/
class Solution {
    public int maxArea(int[] height) {
       int start =0 ,end = height.length-1;
       int maxarea = -1;
       while(start<end){
       
        maxarea = Math.max(Math.min(height[start],height[end])*(end-start),maxarea); 
        if(height[start]<height[end])
            start++;
        else 
            end--;
       }
       return maxarea;
    }
}
