class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] flag = new boolean[my_string.length()];
        for(int i = 0 ; i < my_string.length() ; i++) flag[i] = true;
        for(int n:indices) flag[n] = false;
        String answer = "";
        for(int i = 0 ; i < my_string.length() ; i++) if(flag[i]) answer += my_string.charAt(i);
        return answer;
    }
}