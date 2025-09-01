import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n != 1){
            list.add(n);
            n = n%2 == 0 ? n/2 : 3*n+1;
        }
        list.add(1);
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}