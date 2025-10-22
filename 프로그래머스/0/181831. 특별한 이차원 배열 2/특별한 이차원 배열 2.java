class Solution {
    public int solution(int[][] arr) {
        boolean flag = true;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j] != arr[j][i]) flag = false;
            }
        }
        return flag?1:0;
    }
}