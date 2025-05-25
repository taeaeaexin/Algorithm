import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            
            if(c == '('){
                queue.add(1);
            }else{
                if(queue.isEmpty()) return false;
                queue.poll();
            }
        }

        if(queue.isEmpty()) return true;
        else return false;
    }
}