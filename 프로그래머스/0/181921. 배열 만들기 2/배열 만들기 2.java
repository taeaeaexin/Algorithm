import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = l ; i <= r ; i++){
            String num = String.valueOf(i);
            boolean flag = true;
            for(int j = 0 ; j < num.length() ; j++){
                if(num.charAt(j) != '5' && num.charAt(j) != '0'){
                    flag = false;
                    break;
                }
            }
            if(flag) list.add(i);
        }
        if(list.isEmpty()) list.add(-1);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}