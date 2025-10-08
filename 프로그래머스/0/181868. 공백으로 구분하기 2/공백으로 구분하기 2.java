import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        String[] str = my_string.split(" ");
        for(String s : str){
            if(s.isEmpty()) continue;
            else list.add(s);
        }
        return list.toArray(new String[0]);
    }
}