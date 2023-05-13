//https://leetcode.com/problems/solving-questions-with-brainpower/
class Solution {
    public HashMap<Integer,Long> map = null;
    
    public long getMax(int start,int[][] q){
        if(map.get(start)!=null)
            return map.get(start);
        if(start>=q.length)
            return 0;
        //include start index
        long include = q[start][0] + getMax(start+q[start][1]+1,q);
        //exclude the index    
        long exclude = getMax(start+1, q);
        map.put(start,exclude>include?exclude:include);
        return map.get(start);
        
    }
    public long mostPoints(int[][] questions) {
    
        map = new HashMap<>();
         return getMax(0,questions);
    }
}
