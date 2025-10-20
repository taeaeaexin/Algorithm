import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : arr) list.add(a);
        for(int d : delete_list){
            if(list.contains(d)) list.remove(Integer.valueOf(d));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}