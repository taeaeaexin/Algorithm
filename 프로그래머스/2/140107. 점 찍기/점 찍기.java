class Solution {
    public long solution(int k, int d) {
        // x축 방향으로 0~? * k 까지 점을 찍음
        // y축 방향으로 0~? * k 까지 점을 찍음
        // 원점과 d 이상 멀어지면 안됨
        long answer = 0;
        for(int y = 0 ; y <= d ; y += k){
            //x? -> 최대거리 계산
            long result = (long)Math.sqrt((long)d*d - (long)y*y);
            answer += (result/k)+1;
        }
        return answer;
    }
}