//https://leetcode.com/problems/count-ways-to-build-good-strings/
class Solution {
static int count = 0;
    public static void countHelper(String str, int hi, int lo, String zeros, String ones) {
        int N = str.length();
        if (N >= hi)
            return;
        String count0 = str + zeros;
        String count1 = str + ones;
        if (count0.length()<=hi && count0.length() >= lo) {
            count++;
            
        }
        if (count1.length()<=hi && count1.length() >= lo) {
            count++;
            
        }
        countHelper(count0, hi, lo, zeros, ones);
        countHelper(count1, hi, lo, zeros, ones);
    }
    //Solution 1:Using recursion
    static public int countGoodStrings(int low, int high, int zero, int one) {
        String zeros = "0".repeat(zero);
        String ones = "1".repeat(one);
        count = 0;
        countHelper("", high, low, zeros, ones);
        return count;
    }
    //Solution 2:Using DP
    static public int countGoodStrings(int lo, int high, int zero, int one) {
        int[] count = new int[high+1];
        int number = 0;
        count[0] = 1;
        for(int i=1;i<=high;i++){
            count[i] = ((i>=zero ? count[i-zero]:0)+(i>=one ? count[i-one]:0))%1000000007;
            if(i>=lo)
                number= (number + count[i]) % 1000000007;

        }
        
        return number;
    }
}
