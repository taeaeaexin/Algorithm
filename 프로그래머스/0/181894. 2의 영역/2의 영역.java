class Solution {
    public int[] solution(int[] arr) {
        int min = 999_999, max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 2) {
                if(i < min) min = i;
                if(i > max) max = i;
            }
        }
        if(min == 999_999) return new int[]{-1};
        int[] answer = new int[max-min+1];
        int num = 0;
        for(int i = min ; i <= max ; i++) {
            answer[num] = arr[i];
            num++;
        }
        return answer;
    }
}