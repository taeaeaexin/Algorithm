class Solution {
    public int solution(int a, int d, boolean[] included) {
        int result = 0;
        int n = included.length;
        for(int i = 0 ; i < n ; i++){
            result = included[i] ? result + a : result;
            a += d;
        }
        return result;
    }
}