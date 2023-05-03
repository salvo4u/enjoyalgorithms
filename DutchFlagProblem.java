//https://leetcode.com/problems/sort-colors/
class Solution {

    void swap(int i,int j,int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortColors(int[] arr) {
        int n = arr.length;
        int zero = 0,two = n-1;
        int one = 0;
        while(one<=two){
            
            if(arr[one]==0){
                //Swap with arr[zero]
                swap(zero,one,arr);
                zero++;
                one++;
            }
            else if(arr[one]==2){
                //Swap with arr[zero]
                swap(two,one,arr);
                two--;
            }else
                one++;
        }        
    }
}
