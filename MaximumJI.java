import java.util.Arrays;

public class MaximumJI {
    static class Pairs{
        int i,element;
        Pairs(int j,int ele){
            i = j;
            element = ele;
        }
    }
    static int findMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        Pairs[] pairarr1 = new Pairs[arr.length];
        for(int i = 0; i < arr.length; i++){
             pairarr1[i] = new Pairs(i,arr[i]);
        }
        Arrays.sort(pairarr1,(o1, o2) -> {
            return  o1.element - o2.element;
        });
        int lastindex = -1;
        for (int i=pairarr1.length-1;i>=0;i++){
            if(i>lastindex)
                lastindex = i;
            else
                max = Math.max(max,lastindex-i);
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
