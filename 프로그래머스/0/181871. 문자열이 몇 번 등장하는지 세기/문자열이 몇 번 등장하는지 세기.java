class Solution {
    public int solution(String myString, String pat) {
        int answer = 0, idx = 0;
        while(true){
            int found = myString.indexOf(pat, idx);
            if(found == -1) break;
            answer++;
            idx = found+1;
        }
        return answer;
    }
}