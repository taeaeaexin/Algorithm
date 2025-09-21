import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : arr) list.add(n);
        for(int i = 0 ; i < query.length ; i++) {
            int q = query[i];
            if(i % 2 == 0) list = new ArrayList<>(list.subList(0, q+1));
            else list = new ArrayList<>(list.subList(q, list.size()));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}