import java.util.*;

class Solution {
    int count = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return count;
    }
    
    private void dfs(int[] numbers, int target, int depth, int result){
        if(depth == numbers.length){
            if(result == target) count++;
            return;
        }
        
        int plus = result + numbers[depth];
        int minus = result - numbers[depth];
        
        dfs(numbers, target, depth+1, plus);
        dfs(numbers, target, depth+1, minus);
    }
}