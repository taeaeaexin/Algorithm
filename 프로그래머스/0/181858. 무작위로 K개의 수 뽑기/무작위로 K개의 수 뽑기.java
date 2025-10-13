import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int a : arr) set.add(a);

        int[] answer = new int[k];
        int i = 0;
        
        for(int s : set) {
            answer[i++] = s;
            if(i == k) break;
        }
        
        while(i < k) answer[i++] = -1;
        
        return answer;
    }
}