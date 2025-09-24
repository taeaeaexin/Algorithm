import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0 ; i < commands.length ; i++){
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = a-1 ; j < b ; j++){
                list.add(array[j]);
            }
            list.sort((e,f) -> e-f);
            answer[i] = list.get(c-1);
        }
        return answer;
    }
}