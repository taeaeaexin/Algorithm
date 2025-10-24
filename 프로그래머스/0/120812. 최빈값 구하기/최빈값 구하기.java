class Solution {
    public int solution(int[] array) {
        int[] num = new int[1000];
        for(int a : array) num[a]++;
        int max = 0;
        int max2 = 0;
        int max_index = 0;
        int max2_index = 0;
        for(int i = 0 ; i < num.length ; i++){
            if(num[i] > max) {
                max = num[i];
                max_index = i;
            }
            else if(num[i] > max2) {
                max2 = num[i];
                max2_index =  i;
            }
        }
        return max == max2 ? -1 : max_index;
    }
}