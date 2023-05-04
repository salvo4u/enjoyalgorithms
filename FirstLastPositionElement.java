package enjoyalgos;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstLastPositionElement {
    public int binsarySearch(int arr[],boolean flag,int target){
        int lo = 0, hi = arr.length-1;
        int mid = lo + (hi-lo)/2,index = -1;
        while(lo<=hi){
            mid = lo + (hi-lo)/2;
            if(flag){
                //left end of target
                if(arr[mid]>=target)
                    hi = mid-1;
                else
                    lo = mid+1;
            }else{
                //right end of target
                if(arr[mid]<=target)
                    lo = mid+1;
                else
                    hi = mid-1;
            }
            if(arr[mid]==target)
                index = mid;
        }
        return index;
    }
    public int[] searchRange(int[] arr, int target) {
        
        return new int[]{ binsarySearch(arr,true,target)
                ,binsarySearch(arr,false,target)};

    }
}
