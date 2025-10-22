class Solution {
    public int[][] solution(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int max = n > m ? n : m;
        int answer[][] = new int[max][max];
        
        for(int i = 0 ; i < max ; i++){
            for(int j = 0 ; j < max ; j++){
                if(i < n && j < m) answer[i][j] = arr[i][j];
                else answer[i][j] = 0;
            }
        }
        
        return answer;
    }
}