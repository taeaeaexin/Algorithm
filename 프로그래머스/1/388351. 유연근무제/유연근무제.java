class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for(int i = 0 ; i < schedules.length ; i++){
            int hour = schedules[i] / 100;
            int minute = schedules[i] % 100;
            
            minute += 10;
            if (minute >= 60) {
                hour += 1;
                minute -= 60;
            }
            
            int limit = hour * 100 + minute;
            boolean flag = true;
            
            for (int j = 0; j < 7; j++) {
                int day = (startday + j) % 7;
                if (day == 0 || day == 6) continue;

                if (timelogs[i][j] > limit) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer++;
        }
        return answer;
    }
}