class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        
        for(int i = 0 ; i < picture.length ; i++){
            for(int j = 0 ; j < k ; j++){
                
                String str = "";
                for(int l = 0 ; l < picture[i].length() ; l++){
                    for(int m = 0 ; m < k ; m++){
                        str += picture[i].charAt(l);
                    }
                }
                answer[i*k+j] = str;
            }
        }
        
        return answer;
    }
}