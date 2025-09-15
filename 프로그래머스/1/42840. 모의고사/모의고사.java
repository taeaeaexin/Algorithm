import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] grade = new int[3];
        
        int idx = 1;
        for(int i = 0 ; i < answers.length ; i++){
            if(idx > 5) idx = 1;
            if(answers[i] == idx) grade[0]++;
            idx++;
        }
        
        idx = 1;
        for(int i = 0 ; i < answers.length ; i++){
            if(i % 2 == 0){
                if(answers[i] == 2) grade[1]++;
            }else{
                if(answers[i] == idx) grade[1]++;
                idx++;
                if(idx > 5) idx = 1;
                if(idx == 2) idx = 3;
            }
        }
        
        idx = 3;
        int cnt = 0;
        for(int i = 0 ; i < answers.length ; i++){
            if(cnt == 2){
                cnt = 0;
                if(idx == 3) idx = 1;
                else if(idx == 1) idx = 2;
                else if(idx == 2) idx = 4;
                else if(idx == 4) idx = 5;
                else if(idx == 5) idx = 3;
            }
            if(answers[i] == idx) grade[2]++;
            cnt++;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int max = grade[0];
        for(int i = 0 ; i < grade.length ; i++) {
            if(grade[i] > max) {
                list = new ArrayList<>();
                max = grade[i];
                list.add(i+1);
            } else if(grade[i] == max) {
                list.add(i+1);
            }
        }
        
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}