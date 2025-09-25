import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        ArrayDeque<String> sq = new ArrayDeque<>();
        ArrayDeque<Integer> iq = new ArrayDeque<>();
        
        boolean[] visited = new boolean[words.length];
        sq.add(begin);
        iq.add(0);
        
        while(!sq.isEmpty() && !iq.isEmpty()){
            String str = sq.poll();
            int count = iq.poll();
            if(str.equals(target)) return count;
            
            for(int i = 0 ; i < words.length ; i++){
                if(visited[i]) continue;
                
                int flag = 0;
                for(int j = 0 ; j < words[i].length() ; j++){
                    if(words[i].charAt(j) != str.charAt(j)) flag++;
                }
                if(flag == 1){
                    visited[i] = true;
                    sq.add(words[i]);
                    iq.add(count+1);
                }
            }
        }
        
        return 0;
    }
}