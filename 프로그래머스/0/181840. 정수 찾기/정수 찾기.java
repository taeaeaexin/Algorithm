import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : num_list) list.add(num);
        if(list.contains(n)) return 1;
        return 0;
    }
}