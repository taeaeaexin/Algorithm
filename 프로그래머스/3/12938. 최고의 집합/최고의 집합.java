class Solution {
    public int[] solution(int n, int s) {
        if(n > s) return new int[] {-1};
        
        int div = s / n;
        int mod = s % n;
        int[] answer = new int[n];
        for(int i = 0 ; i < n ; i++){
            answer[i] = div;
        }
        
        while(mod-- > 0){
            answer[n-1]++;
            n--;
        }
        
        return answer;
    }
}