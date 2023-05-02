class Solution {
    public  int partition(int[] arr, int low,int high)
    {
        int pivot = arr[high], pivotloc = low;
        for (int i = low; i <= high; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[pivotloc];
                arr[pivotloc] = temp;
                pivotloc++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[pivotloc];
        arr[pivotloc] = temp;
        return pivotloc;
    }
    public  int kthSmallest(int[] arr, int low,int high, int k)
    {
        int partition = partition(arr, low, high);
        if (partition == k - 1)
            return arr[partition];
        else if (partition < k - 1)
            return kthSmallest(arr, partition + 1, high, k);  
        else
            return kthSmallest(arr, low, partition - 1, k);
    }
    public int findKthLargest(int[] arr, int k) {
        return kthSmallest(arr,0,arr.length-1,arr.length-k+1);
    }
}
