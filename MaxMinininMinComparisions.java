//https://practice.geeksforgeeks.org/problems/max-min/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
class Solution
{ 
    static class Pair{
        int max,min;
        
    }
    static Pair findMaxMinPair(int arr[],int low,int hi){
        Pair p = new Pair();
        if(hi-low<=1){
            p.max = Math.max(arr[hi],arr[low]);
            p.min = Math.min(arr[hi],arr[low]);
            return p;
        }
        int mid = low+(hi-low)/2;
        Pair pleft = findMaxMinPair(arr,low,mid);
        Pair pright = findMaxMinPair(arr,mid,hi);
        p.max = Math.max(pleft.max,pright.max);
        p.min = Math.min(pleft.min,pright.min);
        return p;
        
    }
    public static int findSum(int A[],int N) 
    {
        //code  here
        Pair p = findMaxMinPair(A,0,N-1);
        return p.max+p.min;
    }
}
