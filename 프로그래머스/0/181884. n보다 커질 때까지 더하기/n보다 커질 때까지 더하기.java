class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int i = 0;
        while(i < numbers.length){
            answer += numbers[i];
            if(answer > n) break;
            i++;
        }
        return answer;
    }
}