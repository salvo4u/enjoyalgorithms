//https://leetcode.com/problems/valid-mountain-array/
class Solution {
    public boolean validMountainArray(int[] arr) {
        int count = 0,n=arr.length;
        int up = 0,down = 0;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i+1]>arr[i] && arr[i+2]>arr[i+1] && count < 2){//i am ascending
               count = 1;
               up++;
            }
            else if(arr[i+1]>arr[i] && arr[i+1]>arr[i+2] && count<2){//peak found
            if(n-3==0)
                    return true;
                if(count==1){
                
                if(i+2==n-1)
                    return true;
                }
                count = 2;
                
                    
            }

            else if(arr[i+1]<arr[i] && arr[i+1]>arr[i+2] && count>1){//i am descending
                count = 3;
                down++;
            }
        }
        return count==3 && ((up+down)==n-3);
    }
}
