//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1

class Solution
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int ps = 0,maxlen = 0;
        for(int i=0;i<n;i++){
            ps+=arr[i];
            if(map.get(ps)==null)
                map.put(ps,i);
            else{
                //update the length here
                maxlen = Math.max(maxlen,i-map.get(ps));
            }
        }
        return maxlen;
    }
}
