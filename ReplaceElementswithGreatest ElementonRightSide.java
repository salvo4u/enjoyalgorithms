//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
class Solution {
    public int[] replaceElements(int[] arr) {
        //Solution 1 using a single scan
        int n = arr.length,lastmax = arr[n-1];
        for (int i=arr.length-2;i>=0;i--){
            int current = arr[i];
            arr[i] = lastmax;
            if(current>lastmax)
                lastmax = current;
        }
        arr[n-1] = -1;
        return arr;
    }
}
