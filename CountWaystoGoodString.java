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

    static public int countGoodStrings(int low, int high, int zero, int one) {
        String zeros = "0".repeat(zero);
        String ones = "1".repeat(one);
        count = 0;
        countHelper("", high, low, zeros, ones);
        return count;
    }

}
