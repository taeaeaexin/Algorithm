import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        int count = 0;
        for(int n : map.keySet()){
            count++;
        }
        
        int answer = nums.length/2;
        if(count > answer) return answer;
        else return count;
    }
}