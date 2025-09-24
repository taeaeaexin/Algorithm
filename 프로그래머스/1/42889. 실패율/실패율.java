class Solution {
    public int[] solution(int N, int[] stages) {
        double[] answer = new double[N];
        boolean[] order = new boolean[N];
        // 실패율 = 클리어 못한 수/도달한 수
        for(int i = 0 ; i < N ; i++){
            order[i] = true;
            int clear = 0;
            int notClear = 0;
            for(int n:stages){
                if(n == i+1) {
                    notClear++;
                    clear++;
                }
                else if(n > i+1) clear++;
            }
            if(clear == 0) answer[i] = 0;
            else answer[i] = (double) notClear / clear;
            if(notClear == 0) answer[i] = 0;
        }
        
        // 실패율 높은 스테이지부터 번호 내림차순
        // * N+1은 다 깬 사람
        // 도달유저 0이면 실패율 0
        int[] result = new int[N];
        for(int i = 0 ; i < N ; i++){
            double max = -1;
            int flag = 0;
            for(int j = 0 ; j < N ; j++) {
                if(answer[j] > max && order[j]) {
                    max = answer[j];
                    flag = j;
                }
            }
            result[i] = flag+1;
            order[flag] = false;
        }

        return result;
    }
}