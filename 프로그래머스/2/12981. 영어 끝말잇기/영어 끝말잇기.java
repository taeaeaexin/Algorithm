class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        
        for(int i = 1 ; i < words.length ; i++){
            for(int j = 0 ; j < i ; j++){
                String wi = words[i];
                String wj = words[j];
                if(wi.equals(wj))
                    return new int[] {(i+1)%n==0?n:(i+1)%n, (i+1)%n==0?(i+1)/n:(i+1)/n+1};
                
                if(j==i-1 && wi.charAt(0) != wj.charAt(wj.length()-1))
                    return new int[] {(i+1)%n==0?n:(i+1)%n, (i+1)%n==0?(i+1)/n:(i+1)/n+1};
            }
        }
        return new int[] {0,0};
    }
}