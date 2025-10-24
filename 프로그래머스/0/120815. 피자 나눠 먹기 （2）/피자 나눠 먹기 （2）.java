class Solution {
    public int solution(int n) {
        int num = 0;
        int min = Math.min(n , 6);
        for(int i = min ; i >= 1 ; i--){
            if(6 % i == 0 && n % i == 0){
                num = i;
                break;
            }
        }
        return n/num;
    }
}