import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        myStr = myStr.replace("b", "a");
        myStr = myStr.replace("c", "a");
        String[] str = myStr.split("a");
        for(String s : str){
            if(!s.isEmpty()) list.add(s);
        }
        if(list.isEmpty()) return new String[]{"EMPTY"};
        else return list.toArray(new String [0]);
    }
}