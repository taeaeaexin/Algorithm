class Solution {
    public int solution(int n, int k) {
        if(n < 10) return n*12000 + k*2000;
        int service = n/10;
        return n*12000 + (k-service)*2000;
    }
}