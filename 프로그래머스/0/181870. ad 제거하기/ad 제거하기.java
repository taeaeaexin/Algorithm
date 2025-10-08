import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for(String str : strArr){
            if(str.contains("ad")) continue;
            else list.add(str);
        }
        return list.toArray(new String[0]);
    }
}