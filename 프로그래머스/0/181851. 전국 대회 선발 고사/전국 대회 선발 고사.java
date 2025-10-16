import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> list = new ArrayList<>();
        for(int i = 0 ; i < rank.length ; i++){
            if(attendance[i]){
                list.add(new int[]{i, rank[i]});
            }
        }
        
        list.sort((a, b) -> a[1] - b[1]);
        
        return list.get(0)[0]*10000 + list.get(1)[0]*100 + list.get(2)[0];
    }
}