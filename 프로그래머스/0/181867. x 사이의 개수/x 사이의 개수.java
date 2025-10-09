import java.util.*;

class Solution {
    public int[] solution(String myString) {
        boolean flag = false;
        ArrayList<Integer> list = new ArrayList<>();
        if(myString.charAt(myString.length()-1) == 'x') flag = true;
        String[] str = myString.split("x");
        for(String s : str){
            list.add(s.length());
        }
        if(flag) list.add(0);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}