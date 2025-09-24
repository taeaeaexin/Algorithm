import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] grade = new int[3];
        int a = 0, b = 0, c = 0;
        for(int i = 0 ; i < answers.length ; i++){
            if(a > one.length-1) a = 0;
            if(b > two.length-1) b = 0;
            if(c > three.length-1) c = 0;
            
            if(one[a] == answers[i]) grade[0]++;
            if(two[b] == answers[i]) grade[1]++;
            if(three[c] == answers[i]) grade[2]++;
            a++;
            b++;
            c++;
        }
        int max = 0;
        for(int n:grade) if(n > max) max = n;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < grade.length ; i++) {
            if(max == grade[i]) list.add(i+1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}