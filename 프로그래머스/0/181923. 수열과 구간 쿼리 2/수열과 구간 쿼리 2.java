class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        
        for(int[] n : queries){
            answer[idx] = 9_999_999;
            for(int i = n[0] ; i <= n[1] ; i++){
                if(n[2] < arr[i]) answer[idx] = Math.min(answer[idx], arr[i]);
            }
            if(answer[idx] == 9_999_999) answer[idx] = -1;
            idx++;
        }
        return answer;
    }
}