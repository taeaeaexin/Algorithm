import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n[] : intervals) for(int i = n[0] ; i <= n[1] ; i++) list.add(arr[i]);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}