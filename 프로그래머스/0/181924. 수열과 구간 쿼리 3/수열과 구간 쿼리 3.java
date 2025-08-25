class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] n : queries){
            int tmp = arr[n[0]];
            arr[n[0]] = arr[n[1]];
            arr[n[1]] = tmp;
        }
        return arr;
    }
}