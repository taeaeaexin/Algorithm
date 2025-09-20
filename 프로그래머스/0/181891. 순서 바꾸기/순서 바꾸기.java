class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int [num_list.length];
        int now = 0;
        
        for (int i = n; i < num_list.length; i++) {
            answer[now] = num_list[i];
            now++;
        }

        for (int i = 0; i < n; i++) {
            answer[now] = num_list[i];
            now++;
        }
        
        return answer;
    }
}