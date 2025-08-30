class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] q : queries){
            for (int i = 0; i < arr.length; i++) {
                if (q[0] <= i && i <= q[1] && i % q[2] == 0) arr[i] += 1;
            }
        }
        return arr;
    }
}