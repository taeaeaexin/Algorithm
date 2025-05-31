import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < numbers.length-1 ; i++){
            for(int j = i+1 ; j < numbers.length ; j++){
                int num = numbers[i] + numbers[j];
                if(list.contains(num)) continue;
                else list.add(num);
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = list.get(0);
            list.remove(0);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}