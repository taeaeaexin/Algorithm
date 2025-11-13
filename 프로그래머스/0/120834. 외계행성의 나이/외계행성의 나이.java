class Solution {
    public String solution(int age) {
        String answer = "";
        while(age > 0){
            answer += (char)(age%10+97);
            age /= 10;
        }
        String n_answer = "";
        for(int i = answer.length()-1 ; i >= 0 ; i--){
            n_answer += answer.charAt(i);
        }
        return n_answer;
    }
}