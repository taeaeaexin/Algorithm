import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        ArrayDeque<Integer> stk = new ArrayDeque<>();
        
        while(i < arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else if(stk.peekLast() < arr[i]){
                stk.add(arr[i]);
                i++;
            }else if(stk.peekLast() >= arr[i]){
                stk.removeLast();
            }
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}