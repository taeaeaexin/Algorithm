import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int len=num_list.length;
        int num=num_list[len-1]>num_list[len-2]?num_list[len-1]-num_list[len-2]:num_list[len-1]*2;
        int[] answer = Arrays.copyOf(num_list, len+1);
        answer[len] = num;
        return answer;
    }
}