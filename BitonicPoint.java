
//https://practice.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int lo=0,hi = n-1;
        int mid = lo + (hi-lo)/2;
        while(lo<=hi){
            mid = lo + (hi-lo)/2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && 
        (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            break;
            if(arr[mid+1]>arr[mid])
                lo = mid+1;
            else if(arr[mid+1]<arr[mid]){
                if(arr[mid-1]<arr[mid])
                    break;
                hi = mid-1;    
            }
        }
        return arr[mid];
    }
}
