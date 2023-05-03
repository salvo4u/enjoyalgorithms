package enjoyalgos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//https://www.enjoyalgorithms.com/blog/count-distinct-elements-in-every-window
public class DistinctElements {
    public class Solution {
        public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
            if (B > A.size()) return new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < B; i++) {
                map.put(A.get(i), map.getOrDefault(A.get(i), 0)+1);
            }
            list.add(map.size());
            for (int i = 1, j = i+B-1; j <A.size(); i++, j++) {
                map.put(A.get(i-1), map.get(A.get(i-1))-1);
                if(map.get(A.get(i-1))==0){
                    map.remove(A.get(i-1));
                }
                map.put(A.get(j), map.getOrDefault(A.get(j) ,0)+1);
                list.add(map.size());
            }
            return list;
        }
    }
}
