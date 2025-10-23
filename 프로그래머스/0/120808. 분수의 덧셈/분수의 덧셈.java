class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int n = numer1 * denom2 + numer2 * denom1;
        int m = denom1 * denom2;
        
        int num = Math.min(n, m);
        
        for(int i = num ; i >= 1 ; i--){
            if(n%i == 0 && m%i == 0) {
                num = i;
                break;
            }
        }
        answer[0] = n / num;
        answer[1] = m / num;
        return answer;
    }
}