//https://practice.geeksforgeeks.org/problems/buildings-receiving-sunlight3032/
class Solution {

    public static int longest(int arr[],int n)
    {
        int count = 0;
        int maxheight = -1;
        for(int i=0;i<n;i++){
            if(maxheight<=arr[i]){
                maxheight = arr[i];
                count++;
            }
        }
        return count;
    }
}
