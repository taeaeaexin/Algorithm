import java.util.*;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        String[] arr = myString.split("x");
        for(String s : arr){
            if(s.isEmpty()) continue;
            else list.add(s);
        }
        list.sort((a,b) -> a.compareTo(b));
        return list.toArray(new String [0]);
    }
}